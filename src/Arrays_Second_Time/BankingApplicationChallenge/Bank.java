package Arrays_Second_Time.BankingApplicationChallenge;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches = new ArrayList<>();

    public void addBranch(String branchName){
        branches.add(new Branch(branchName));
    }

    public void addCustomer(String branchName, String customerName, Double transaction){
        getBranch(branchName).addCustomer(customerName, transaction);
    }

    public void addCustomer(String branchName, String customerName){
        getBranch(branchName).addCustomer(customerName);
    }

    public void addTransaction(String branchName, String customerName, Double transaction){
        Branch branch = getBranch(branchName);
        if(branch == null) return;
        else getBranch(branchName).addTransaction(customerName, transaction);
    }

    public String getBranchCustomersString(String branchName){
        return getBranch(branchName).toString();
    }

    public String getCustTransactionsString(String branchName, String customerName){
        Branch branch = getBranch(branchName);
        if(branch == null) return branchName + " branch not found.";
        Customer cust = branch.getCustomer(customerName);
        if(cust == null) return customerName + " not found at " + branch.getName();
        return branch.getName() + " Branch\n" + cust.toString();
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
