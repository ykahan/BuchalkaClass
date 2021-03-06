package Arrays.Banking_App_Challenge;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;
    private String name;

    public Bank(String name) {
        this.branches = new ArrayList<Branch>();
        this.name = name;
    }

    public String[] getBranches() {
        String[] branchNames = new String[branches.size()];
        for (int i = 0; i < branches.size(); i++) {
            branchNames[i] = branches.get(i).getName();
        }
        return branchNames;
    }

    public int findBranch(String name) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getName().toLowerCase().equals(name.toLowerCase())) return i;
        }
        return -1;
    }

    public void showBranches() {
        StringBuilder sb = new StringBuilder();
        String[] branches = getBranches();
        for (int i = 0; i < branches.length; i++) {
            sb.append("\nBranch #");
            sb.append(i + 1);
            sb.append("]");
            sb.append("\t");
            sb.append(branches[i]);
        }
        System.out.println(sb.toString());
    }

    public int showBranchCustomers(String branchName) {
        int index = findBranch(branchName);
        if (index != -1) {
            Branch branch = branches.get(index);
            System.out.println( branch.showAllCustomers());
        }
        else System.out.println("=========================\n" + branchName + " branch not found");
        return index;
    }

    public String[] getBranchCustomers(String branchName) {
        int index = findBranch(branchName);
        if (index != -1){
            Branch branch = branches.get(index);
            return branch.getAllCustomersNames();
        }
        else System.out.println("Branch not found.");
        return null;
    }

    public boolean addTransaction(String branchName, String customerName, double sum) {
        int branchIndex = findBranch(branchName);
        if (branchIndex != -1) {
            Branch branch = branches.get(branchIndex);
            int customerIndex = branch.findCustomer(customerName);
            if (customerIndex != -1) {
                branch.newTransaction(customerName, sum);
                return true;
            }
            else System.out.println("Customer not found");
        } else System.out.println("Branch not found");
         return false;
    }

    private double[] getCustomerTransactions(String branchName, String customerName) {
        int branchIndex = findBranch(branchName);
        if (branchIndex != -1) {
            Branch branch = branches.get(branchIndex);
            int customerIndex = branch.findCustomer(customerName);
            if (customerIndex != -1) {
                Customer customer = branch.getCustomer(customerName);
                return customer.getTransactions();
            }
        }
        return null;
    }

    public void showCustomerTransactions(String branchName, String customerName){
        double[] transactions = getCustomerTransactions(branchName, customerName);
        StringBuilder sb = new StringBuilder();
        sb.append("============================");
        if(transactions != null) {
            if(transactions.length == 0) sb.append(customerName + " has no transactions.");
            else{
                sb.append("\n" + customerName + "'s transactions at " + branchName + " branch:");
                for(int i = 0; i < transactions.length; i++){
                    sb.append("\nTransaction #");
                    sb.append(i + 1);
                    sb.append(") ");
                    sb.append(transactions[i]);
                }
            }
            System.out.println(sb.toString());
        } else{
            sb.append("\nEither " + branchName + " branch does not exist, or else "
                    + customerName + " is not a customer there.");
            System.out.println(sb.toString());
        }
    }

    public double getCustomerBalance(String branchName, String customerName) {
        int branchIndex = findBranch(branchName);
        if (branchIndex != -1) {
            Branch branch = branches.get(branchIndex);
            int customerIndex = branch.findCustomer(customerName);
            if (customerIndex != -1) {
                Customer customer = branch.getCustomer(customerName);
                return customer.getBalance();
            }
        }
        return -200.0;
    }

    public boolean addBranch(String branchName, String firstCustomerName, double sum) {
        boolean added = addBranch(branchName);
        if (added) {
            int index = findBranch(branchName);
            this.branches.get(index).addCustomer(firstCustomerName, sum);
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double sum){
        int branchIndex = findBranch(branchName);
        if(branchIndex != -1){
            Branch branch = branches.get(branchIndex);
            int customerIndex = branch.findCustomer(customerName);
            if(customerIndex == -1) {
                branch.addCustomer(customerName, sum);
                return true;
            }
        }
        return false;
    }

    public boolean addBranch(String branchName) {
        int index = findBranch(branchName);
        if (index == -1) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean dropBranch(String oldName) {
        int index = findBranch(oldName);
        if (index == -1) {
            branches.remove(index);
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        for(int i = 0; i < branches.size(); i++){
            sb.append(branches.get(i).toString());
        }
        return sb.toString();
    }
}
