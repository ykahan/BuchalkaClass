package Arrays_Second_Time.BankingApplicationChallenge;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer cust){
        customers.add(cust);
    }

    public void addCustomer(Customer cust, double transaction){
        addTransaction(cust, transaction);
        addCustomer(cust);
    }

    public void addTransaction(Customer cust, double transaction){
        cust.addTransaction(transaction);
    }
}
