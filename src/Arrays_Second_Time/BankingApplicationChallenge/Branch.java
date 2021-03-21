package Arrays_Second_Time.BankingApplicationChallenge;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers = new ArrayList<>();
    private String name;

    public Branch(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCustomer(String customerName){
        customers.add(new Customer(customerName));
    }

    public void addCustomer(String customerName, double transaction) {
        customers.add(new Customer(customerName, transaction));
    }

    public void addTransaction(String customerName, double transaction) {
        Customer cust = getCustomer(customerName);
        cust.addTransaction(transaction);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (customers.size() > 0) {
            sb.append("Customers of " + name + " branch:");
            for (int i = 0; i < customers.size(); i++) {
                sb.append(i + 1 + ") " + customers.get(i).getName() + "\n");
            }
        } else {
            sb.append("No customers found in " + name + " branch");
        }
        return sb.toString();
    }

    public Customer getCustomer(String name){
        for (int i = 0; i < customers.size(); i++) {
            if(customers.get(i).getName().equals(name)) return customers.get(i);
        }
        return null;
    }
}
