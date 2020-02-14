package Arrays.Banking_App_Challenge;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> cal;
    private String name;

    public Branch(String name) {
        this.cal = new ArrayList<Customer>();
        this.name = name;
    }

    public void addCustomer(String name, double sum){
        String[] names = getCustomerNames();
        for(int i = 0; i < names.length; i++){
            if(names[i].toLowerCase().equals(name.toLowerCase())){
                System.out.println("Applicant already a customer at this branch.");
                return;
            }
        }
        cal.add(new Customer(name));
        newTransaction(name, sum);
    }

    public String getName(){
        return this.name;
    }

    public void dropCustomer(Customer customer){
        dropCustomer(customer.getName());
    }

    public void dropCustomer(String name){
        for(int i = 0; i < this.cal.size(); i++){
            if(cal.get(i).getName().toLowerCase().equals(name)){
                Customer customer = cal.get(i);
                cal.remove(customer);
                break;
            }
        }
        System.out.println("Customer not found");
    }

    public String[] getCustomerNames(){
        String[] names = new String[cal.size()];
        for(int i = 0; i < cal.size(); i++){
            String name = cal.get(i).getName();
            names[i] = name;
        }
        return names;
    }

    public double[] getTransactions(String customerName){
        for(int i = 0; i < cal.size(); i++){
            if(cal.get(i).getName().toLowerCase().equals(customerName.toLowerCase())){
                return cal.get(i).getTransactions();
            }
        }
        System.out.println("Customer not found");
        return null;
    }

    public double getBalance(String customerName){
        for(int i = 0; i < cal.size(); i++){
            if(cal.get(i).getName().toLowerCase().equals(customerName.toLowerCase())){
                return cal.get(i).getBalance();
            }
        }
        System.out.println("Customer not found");
        return -200.0;
    }

    private int locateCustomer(String name){
        for(int i = 0; i < cal.size(); i++){
            if(cal.get(i).getName().toLowerCase().equals(name.toLowerCase())) return i;
        }
        return -1;
    }

    public void newTransaction(String name, double sum){
        for(int i = 0; i < cal.size(); i++){
            if(cal.get(i).getName().toLowerCase().equals(name.toLowerCase())){
                cal.get(i).transaction(sum);
            }
        }
    }
}
