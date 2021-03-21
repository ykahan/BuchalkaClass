package Arrays_Second_Time.BankingApplicationChallenge;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches = new ArrayList<>();

    public void addBranch(Branch branch){
        branches.add(branch);
    }

    public void addCustomer(String branchName, String customerName, Double transaction){
        getBranch(branchName).addCustomer(customerName, transaction);
    }

    public void addTransaction(String branchName, String customerName, Double transaction){
        getBranch(branchName).addTransaction(customerName, transaction);
    }

    public String getBranchCustomersString(String branchName){
        return getBranch(branchName).toString();
    }

    public String getCustTransactionsString(String branchName, String name){
        Branch branch = getBranch(branchName);
        Customer cust = branch.getCustomer(name);
        if(cust == null) return "Customer not found";
        return cust.toString();
    }

    private Branch getBranch(String branchName) {
        Branch branch = null;
        for (int i = 0; i < branches.size(); i++) {
            if(branches.get(i).getName().equals(branchName)) {
                return branches.get(i);
            }
        }
        return branch;
    }
}
