package Arrays_Second_Time.BankingApplicationChallenge;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Big Bank");
        String betShemesh = "Bet Shemesh";
        bank.addBranch(betShemesh);
        System.out.println(bank.getBranchCustomersString(betShemesh));
        String beitar = "Beitar Ilit";
        bank.addBranch(beitar);
        String jimmy = "Jimmy";
        String franky = "Franky";
        bank.addCustomer(betShemesh, jimmy);
        bank.addCustomer(betShemesh, franky, 5.6);
        System.out.println(bank.getBranchCustomersString(betShemesh));
        System.out.println(bank.getCustTransactionsString(betShemesh, jimmy));
        System.out.println(bank.getCustTransactionsString(betShemesh, franky));
        bank.addTransaction(betShemesh, jimmy, 4.6);
        bank.addTransaction(betShemesh, franky, 2.3);
        System.out.println(bank.getCustTransactionsString(betShemesh, franky));
        System.out.println(bank.getCustTransactionsString(betShemesh, jimmy));
        System.out.println(bank.getBranchCustomersString(beitar));
        bank.addTransaction(beitar, franky, 3.4);
        System.out.println(bank.getCustTransactionsString(beitar, franky));
        System.out.println(bank.getCustTransactionsString(beitar, jimmy));
        bank.addCustomer(beitar, jimmy);
        System.out.println(bank.getBranchCustomersString(beitar));
    }
}
