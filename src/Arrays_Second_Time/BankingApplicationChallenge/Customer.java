package Arrays_Second_Time.BankingApplicationChallenge;

import java.util.ArrayList;

public class Customer {
    private ArrayList<Double> transactions = new ArrayList<>();
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public double getTransaction(int index){
        return transactions.get(index);
    }

    public void addTransaction(double transaction){
        transactions.add(transaction);
    }

    public double getLastTransaction(){
        return transactions.get(transactions.size() - 1);
    }

    public double getFirstTransaction(){
        return transactions.get(0);
    }

    public void alterTransaction(int index, double transaction){
        transactions.set(index, transaction);
    }

    public void deleteTransaction(int index){
        transactions.remove(index);
    }
}
