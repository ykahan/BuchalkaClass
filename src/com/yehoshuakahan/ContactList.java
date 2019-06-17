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
                    System.out.println("Removing item");
                    break;
                }
            }
        } else if (!exists) {
            System.out.println("No such contact found");
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