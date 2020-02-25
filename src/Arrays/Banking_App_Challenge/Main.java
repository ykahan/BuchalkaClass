package Arrays.Banking_App_Challenge;

public class Main {
    public static void main(String[] args) {
        Bank national = new Bank("National Bank");
        national.addBranch("Beitar");
        national.addCustomer("Beitar", "Frankie", 253.23);
        national.addTransaction("Beitar", "Frankie", -12.64);
        national.showBranchCustomers("Beitar");
        national.addCustomer("Jerusalem", "Jim", 1.23);
        national.showBranchCustomers("Jerusalem");
        national.showCustomerTransactions("Beitar", "Frankie");
        national.showCustomerTransactions("Beitar", "Jimmy");
        boolean notExists = national.addCustomer("Beitar", "Frankie", 0.52);
        if(!notExists) System.out.println("Frankie's already a customer there.");
        notExists = national.addCustomer("Beitar", "Timmy", 8484.23);
        if(!notExists) System.out.println("Timmy's already a customer there");
        national.showBranchCustomers("Beitar");
        national.showBranches();
    }
}

