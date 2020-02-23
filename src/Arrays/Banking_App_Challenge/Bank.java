package Arrays.Banking_App_Challenge;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> bal;

    public Bank(){
        this.bal = new ArrayList<Branch>();
    }

    public String[] getBranches(){
        String[] branchNames = new String[bal.size()];
        for(int i = 0; i < bal.size(); i++) {
            branchNames[i] = bal.get(i).getName();
        }
        return branchNames;
    }

    public void showBranches(){
        StringBuilder sb = new StringBuilder();
        String[] branches = getBranches();
        for(int i = 0; i < branches.length; i++){
            sb.append("\nBranch #");
            sb.append(i + 1);
            sb.append("]");
            sb.append("\t");
            sb.append(branches[i]);
        }
        System.out.println(sb.toString());
    }

    public String[] showBranchCustomers(String branchName){
        for(int i = 0; i < bal.size(); i++){
            if(bal.get(i).getName().toLowerCase().equals(branchName.toLowerCase())){
                bal.get(i).showAllCustomers();
            }
        }
        System.out.println("Branch not found");
    }

    public void addTransaction(String branchName, String customerName, double sum){
        for(int i = 0; i < bal.size(); i++){
            if(bal.get(i).getName().toLowerCase().equals(branchName.toLowerCase())){
                bal.get(i).newTransaction(customerName, sum);
                return;
            }
        }
        System.out.println("Branch or customer not found");
        return;
    }

    public double[] getCustomerTransactions(String branchName, String customerName){
        for(int i = 0; i < bal.size(); i++){
            if(bal.get(i).getName().toLowerCase().equals(branchName.toLowerCase())){
                return bal.get(i).getTransactions(customerName);
            }
        }
        System.out.println("Branch not found");
        return null;
    }

    public double getCustomerBalance(String branchName, String customerName){
        for(int i = 0; i < bal.size(); i++){
            if(bal.get(i).getName().toLowerCase().equals(branchName.toLowerCase())){
                return bal.get(i).getBalance(customerName);
            }
        }
        System.out.println("Branch not found");
        return -200.0;
    }

    public void newBranch(String branchName, String firstCustomerName, double sum){
        for(int i = 0; i < bal.size(); i++){
            String name = bal.get(i).getName();
            if(name.toLowerCase().equals(branchName.toLowerCase())){
                System.out.println("Cannot add branch with that name, because found one that already has that name.");
                return;
            }
        }
        this.bal.add(new Branch(branchName));

        this.bal.get(bal.size() - 1).addCustomer(firstCustomerName, sum);
    }

    public void newBranch(String branchName){
        for(int i = 0; i < bal.size(); i++){
            String name = bal.get(i).getName();
            if(name.toLowerCase().equals(branchName.toLowerCase())){
                System.out.println("Cannot add branch with that name, because found one that already has that name.");
                return;
            }
        }
        this.bal.add(new Branch(branchName));
    }

    public void dropBranch(String oldName){
        for(int i = 0; i < bal.size(); i++) {
            String name = bal.get(i).getName();
            if (name.toLowerCase().equals(oldName.toLowerCase())) {
                bal.remove(i);
                return;
            }
        }
        System.out.println("Did not find branch with that name.");
    }
}
