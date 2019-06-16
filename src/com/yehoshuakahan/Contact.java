package com.yehoshuakahan;

public class Contact {
    private String Name;
    private String phoneNumber;

    public Contact(String Name, String phoneNumber){
        this.Name = Name;
        this.phoneNumber = phoneNumber;
    }

    public Contact(){
        this.Name = "";
        this.phoneNumber = "";
    }

    public String getName(){
        return this.Name;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setPhoneNumber(String number){
        this.phoneNumber = number;
    }

    public void setName(String Name){
        this.Name = Name;
    }

}

