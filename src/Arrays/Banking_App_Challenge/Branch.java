package Arrays.Banking_App_Challenge;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> cal;
    private String name;

    public Branch(String name) {
        this.cal = new ArrayList<Customer>();
        this.name = name;
    }

    public boolean addCustomer(String name, double sum) {
        if (findCustomer(name) != -1) return false;
        cal.add(new Customer(name));
        newTransaction(name, sum);
        return true;
    }

    private Customer getCustomer(String customerName){
        int index = findCustomer(customerName);
        if(index != -1) return cal.get(index);
        return null;
    }

    public int findCustomer(String name) {
        String[] names = getAllCustomers();
        for (int i = 0; i < names.length; i++) {
            if (names[i].toLowerCase().equals(name.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }

    public String getName() {
        return this.name;
    }

    public void dropCustomer(Customer customer) {
        dropCustomer(customer.getName());
    }

    public void dropCustomer(String name) {
        int customerIndex = findCustomer(name);
        if (customerIndex != -1) cal.remove(customerIndex);
        else System.out.println("Customer not found");
    }

    public String[] getAllCustomers() {
        String[] names = new String[cal.size()];
        for (int i = 0; i < cal.size(); i++) {
            String name = cal.get(i).getName();
            names[i] = name;
        }
        return names;
    }

    public void showAllCustomers() {
        StringBuilder sb = new StringBuilder();
        String[] names = getAllCustomers();
        for (int i = 0; i < names.length; i++) {
            sb.append("\nCustomer #");
            sb.append(i + 1);
            sb.append("]");
            sb.append("\t");
            sb.append(cal.get(i).getName());
        }
        System.out.println(sb.toString());
    }

    public double[] getTransactions(String name) {
        int index = findCustomer(name);
        if (index != -1) return cal.get(index).getTransactions();
        return null;
    }

    public void showTransactions(String customerName) {
        double[] transactions = getTransactions(customerName);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < transactions.length; i++) {
            sb.append("\nTransaction #");
            sb.append(i + 1);
            sb.append("]");
            sb.append("\t");
            sb.append(transactions[i]);
        }
        System.out.println(sb.toString());
    }

    public double getBalance(String name) {
        int index = findCustomer(name);
        if (index != -1) return cal.get(index).getBalance();
        else return -200.0;
    }

    public void newTransaction(String name, double sum) {
        int index = findCustomer(name);
        if (index != -1) cal.get(index).addTransaction(sum);
        else System.out.println("That person is not a customer at this branch.");
    }

    public double[] getCustomerTransactions(String name){
        int index = findCustomer(name);
        if(index != -1) return cal.get(index).getTransactions();
        return null;
    }
}
