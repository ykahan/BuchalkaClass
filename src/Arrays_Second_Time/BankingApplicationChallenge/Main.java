package Arrays_Second_Time.BankingApplicationChallenge;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        String branchName = "Bet Shemesh";
        bank.addBranch(branchName);
        System.out.println(bank.getBranchCustomersString(branchName));
        String newBranch = "Beitar Ilit";
        bank.addBranch(newBranch);
        String cust1 = "Jimmy";
        String cust2 = "Franky";
        bank.addCustomer(branchName, cust1);
        bank.addCustomer(branchName, cust2, 5.6);
        System.out.println(bank.getBranchCustomersString(branchName));
        System.out.println(bank.getCustTransactionsString(branchName, cust1));
        System.out.println(bank.getCustTransactionsString(branchName, cust2));
        bank.addTransaction(branchName, cust1, 4.6);
        System.out.println(bank.getCustTransactionsString(branchName, cust1));
        System.out.println(bank.getBranchCustomersString(newBranch));
        bank.addTransaction(newBranch, cust2, 3.4);
        System.out.println(bank.getCustTransactionsString(newBranch, cust2));
        System.out.println(bank.getCustTransactionsString(newBranch, cust1));
    }
}
