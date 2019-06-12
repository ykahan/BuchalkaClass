package com.yehoshuakahan;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String firstName;
    private String lastName;
    private String email;
    private String telephone;

    public BankAccount(String accountNumber, double balance, String firstName, String lastName, String email, String telephone){
        this.accountNumber = accountNumber;
        if(balance >= 0) this.balance = balance;
        else this.balance = 0;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.telephone = telephone;
    }

    public BankAccount(){

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void depositFunds() {
        printOldBalance();
        this.balance++;
        printDeposit();
        printNewBalance();
    }

    public void depositFunds(double sum) {
        printOldBalance();
        this.balance += sum;
        printDeposit(sum);
        printNewBalance();
    }

    public void withdrawFunds() {
        printOldBalance();
        if (balance >= 1.0) {
            this.balance--;
            printWithdrawal();
            printNewBalance();
        } else{
            printInsufficientFunds();
        }
    }

    public void withdrawFunds(double sum) {
        printOldBalance();
        if(balance >= sum) {
            this.balance -= sum;
            printWithdrawal(sum);
            printNewBalance();
        } else{
            printInsufficientFunds(sum);
        }
    }

    private void printBalance(boolean old) {
        if (old) System.out.println("Old Balance: $" + this.balance);
        else System.out.println("New Balance: $" + this.balance);
    }

    public void printOldBalance() {
        printBalance(true);
    }

    public void printNewBalance() {
        printBalance(false);
    }

    public void printCurrentBalance(){
        System.out.println("Current Balance: $" + this.balance);
    }

    public void printInsufficientFunds(double sum){
        printWithdrawal(sum);
        System.out.println("Sorry, you do not have enough funds to withdraw $" + sum);
        printCurrentBalance();
    }

    public void printInsufficientFunds(){
        printInsufficientFunds(1.0);
    }

    public void printDeposit(double sum){
        System.out.println("Deposit: $" + sum);
    }

    public void printDeposit(){
        printDeposit(1.0);
    }

    public void printWithdrawal(double sum){
        System.out.println("Withdrawal: $" + sum);
    }

    public void printWithdrawal(){
        printWithdrawal(1.0);
    }
}
