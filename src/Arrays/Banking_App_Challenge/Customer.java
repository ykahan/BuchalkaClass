package Arrays.Banking_App_Challenge;

import java.util.ArrayList;

public class Customer {
    private ArrayList<Double> transactions;
    private String name;

    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
    }

    public Customer(String name, double sum){
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(sum);
    }

    public double[] getTransactions(){
        double[] transactionsArray = new double[this.transactions.size()];
        for(int i = 0; i < transactionsArray.length; i++){
            transactionsArray[i] = this.transactions.get(i);
        }
        return transactionsArray;
    }

    public String getName(){
        return this.name;
    }

    public void addTransaction(double sum){
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
