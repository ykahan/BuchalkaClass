package Arrays.Banking_App_Challenge;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> bal;

    public Bank() {
        this.bal = new ArrayList<Branch>();
    }

    public String[] getBranches() {
        String[] branchNames = new String[bal.size()];
        for (int i = 0; i < bal.size(); i++) {
            branchNames[i] = bal.get(i).getName();
        }
        return branchNames;
    }

    public int findBranch(String name) {
        for (int i = 0; i < bal.size(); i++) {
            if (bal.get(i).getName().toLowerCase().equals(name.toLowerCase())) return i;
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

    public void showBranchCustomers(String branchName) {
        int index = findBranch(branchName);
        if (index != -1) bal.get(index).showAllCustomers();
        else System.out.println("Branch not found");
    }

    public String[] getBranchCustomers(String branchName) {
        int index = findBranch(branchName);
        if (index != -1) return bal.get(index).getAllCustomers();
        else System.out.println("Branch not found.");
        return null;
    }

    public void addTransaction(String branchName, String customerName, double sum) {
        int branchIndex = findBranch(branchName);
        if (branchIndex != -1) {
            int customerIndex = bal.get(branchIndex).findCustomer(customerName);
            if (customerIndex != -1) bal.get(branchIndex).newTransaction(customerName, sum);
            else System.out.println("Customer not found");
        } else System.out.println("Branch not found");
    }

    public double[] getCustomerTransactions(String branchName, String customerName) {
        int branchIndex = findBranch(branchName);
        if (branchIndex != -1) {
            int customerIndex = bal.get(branchIndex).findCustomer(customerName);
            if (customerIndex != -1) return bal.get(branchIndex).getCustomerTransactions(customerName);
        }
        return null;
    }

    public double getCustomerBalance(String branchName, String customerName) {
        int branchIndex = findBranch(branchName);
        if (branchIndex != -1) {
            int customerIndex = bal.get(branchIndex).findCustomer(customerName);
            if (customerIndex != -1) return bal.get(branchIndex).getBalance(customerName);
        }
        return -200.0;
    }

    public boolean newBranch(String branchName, String firstCustomerName, double sum) {
        boolean added = newBranch(branchName);
        if (added) {
            int index = findBranch(branchName);
            this.bal.get(index).addCustomer(firstCustomerName, sum);
            return true;
        }
        return false;
    }

    public boolean newBranch(String branchName) {
        int index = findBranch(branchName);
        if (index == -1) {
            this.bal.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean dropBranch(String oldName) {
        int index = findBranch(oldName);
        if (index == -1) {
            bal.remove(index);
            return true;
        }
        return false;
    }
}
