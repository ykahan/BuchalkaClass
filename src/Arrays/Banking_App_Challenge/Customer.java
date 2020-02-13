package Arrays.Banking_App_Challenge;

import java.util.ArrayList;

public class Customer {
    private ArrayList<Double> transactions;
    private String name;

    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
    }

    public String getName(){
        return this.name;
    }

    private void transaction(Double sum){
        if(sum < 0){
            double newBalance = getBalance() + sum;
            if(newBalance < -100) {
                System.out.println("Withdrawal rejected for insufficient funds.");
                return;
            }
        }
        transactions.add(sum);
    }

    public double getBalance(){
        double balance = 0;
        for(int i = 0; i < this.transactions.size(); i++){
            balance += this.transactions.get(i);
        }
        return balance;
    }
}
