package com.yehoshuakahan;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactList {
    private ArrayList<Contact> list = new ArrayList<Contact>();

    public boolean contactExists(String Name) {
        Name = Name.trim();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Contact contact = list.get(i);
            String oldName = contact.getName();
            oldName = oldName.trim();
            if (oldName.contentEquals(Name)) return true;
        }
        return false;
    }

    public String getPhoneNumber(String name){
        int size = list.size();
        String phoneNumber = null;
        for(int i = 0; i < size; i++){
            Contact contact = list.get(i);
            String contactName = contact.getName();
            if(contactName.contentEquals(name)) {
                phoneNumber = contact.getPhoneNumber();
                break;
            }
        }
        return phoneNumber;
    }

    private void replaceContact(Contact oldContact, Contact newContact){
        int indexOld = getIndex(oldContact);
        if(indexOld < 0) System.out.println("Old contact not found.");
        else{
            this.list.set(indexOld, newContact);
        }
    }

    public void replaceContact(String oldName, Contact newContact){
        int size = this.list.size();
        for(int i = 0; i < size; i++){
            Contact oldContact = this.list.get(i);
            String foundName = oldContact.getName();
            if(foundName.contentEquals(oldName)){
                replaceContact(oldContact, newContact);
                return;
            }
        }
    }

    public int getSize(){
        return this.list.size();
    }

    public Contact findContact(int index){
        return this.list.get(index);
    }

    public void reportContactExists(String name) {
        name = name.trim();
        boolean exists = contactExists((name));
        if (exists) System.out.println("That contact exists.");
        else System.out.println("Contact not found.");
    }


    public void addContact(String Name, String phoneNumber) {
        Name = Name.trim();
        phoneNumber = phoneNumber.trim();
        boolean alreadyExists = contactExists(Name);
        if (!alreadyExists) {
            Contact contact = new Contact(Name, phoneNumber);
            list.add(contact);
        } else{
            System.out.println("Contact already exists.");
        }
    }

    public void addContact(Contact contact){
        String name = contact.getName();
        String number = contact.getPhoneNumber();
        addContact(name, number);
    }

    public void removeContact(String Name) {
        Name = Name.trim();
        int size = list.size();
        boolean exists = contactExists(Name);
        if (exists) {
            for (int i = 0; i < size; i++) {
                Contact contact = list.get(i);
                String oldName = contact.getName().trim();
                String oldPhone = contact.getPhoneNumber().trim();
                if (Name.contentEquals(oldName)) {
                    list.remove(i);
                    break;
                }
            }
        }
    }

    public void editContact(String name, String newPhoneNumber) {
        name = name.trim();
        newPhoneNumber = newPhoneNumber.trim();
        boolean alreadyExists = contactExists(name);
        if (alreadyExists) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Contact contact = list.get(i);
                String oldName = contact.getName();
                if (oldName.contentEquals(name)) {
                    contact.setPhoneNumber(newPhoneNumber);
                }
            }
        } else {
            System.out.println("Contact not found");
        }
    }

    private int getIndex(Contact contact) {
        return list.indexOf(contact);
    }

    private Contact getContact(String Name, String phoneNumber) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).getName().contentEquals(Name) && list.get(i).getPhoneNumber().contentEquals(phoneNumber))
                return list.get(i);
        }
        return null;
    }

    public void printAllContacts() {
        int size = list.size();
        System.out.println("Printing Contact List...");
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                Contact contact = list.get(i);
                String name = contact.getName();
                String number = contact.getPhoneNumber();
                System.out.println("\nContact #" + (i + 1));
                System.out.println("Name: " + name);
                System.out.println("Phone Number: " + number);
                if (i == size - 1) System.out.println("---------------------------");
            }
        } else System.out.println("No contacts found in list.");
    }
}