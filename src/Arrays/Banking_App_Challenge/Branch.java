package Arrays.Banking_App_Challenge;

import java.util.ArrayList;

public class Branch {
    ArrayList<Customer> cal;

    public Branch() {
        this.cal = new ArrayList<Customer>();
    }

    public void addCustomer(String name, double sum){
        String[] names = getCustomerNames();
        for(int i = 0; i < names.length; i++){
            if(names[i].equals(name)){
                System.out.println("Applicant already a customer at this branch.");
                return;
            }
        }
        cal.add(new Customer(name));

    }

    public String[] getCustomerNames(){
        String[] names = new String[cal.size()];
        for(int i = 0; i < cal.size(); i++){
            String name = cal.get(i).getName();
            names[i] = name;
        }
        return names;
    }
}
