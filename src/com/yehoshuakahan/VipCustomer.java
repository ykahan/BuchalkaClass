package com.yehoshuakahan;

public class VipCustomer {
    private String firstName;
    private String lastName;
    private String email;
    private double creditLimit;

    public VipCustomer(String firstName, String lastName, String email, double creditLimit){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public VipCustomer(String firstName, String lastName, String email){
        this(firstName, lastName, email, 1000.0);
    }

    public VipCustomer(){
        this("Joe", "Smith", "jsmith@yahoo.com", 500.0);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
