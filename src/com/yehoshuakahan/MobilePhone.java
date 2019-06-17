package com.yehoshuakahan;

import java.util.Scanner;

public class MobilePhone {
    private ContactList list;
    private static Scanner scanner;

    public MobilePhone() {
        this.list = new ContactList();
        this.scanner = new Scanner(System.in);
    }

    public void printInstructions() {
        System.out.println("Instructions:");
        System.out.println("**********************");
        System.out.println("Enter 1 To Print Instructions");
        System.out.println("Enter 2 To Print The Contact List");
        System.out.println("Enter 3 To Add A Contact");
        System.out.println("Enter 4 To Edit A Contact");
        System.out.println("Enter 5 To Remove A Contact");
        System.out.println("Enter 6 To Replace An Old Contact With A New Contact");
        System.out.println("Enter 7 To Quit The Program");
        int response = scanner.nextInt();
        scanner.nextLine();
        processUserInput(response);
    }

    public void processUserInput(int response) {
        String newName;
        String newNumber;
        String oldName;
        Contact contact;
        boolean exists;
        int index;
        switch (response) {
            case (1):
                printInstructions();
                requestCommand();
                break;
            case (2):
                printContactList();
                requestCommand();
                break;
            case (3):
                contact = receiveContact(true);
                addContact(contact);
                requestCommand();
                break;
            case (4):
                newName = receiveName(false);
                exists = list.contactExists(newName);
                if (exists) {
                    newNumber = receivePhoneNumber();
                    editContact(newName, newNumber);
                } else {
                    contactNotFoundError();
                }
                requestCommand();
                break;
            case (5):
                oldName = receiveName(false);
                exists = list.contactExists(oldName);
                if (exists) {
                    removeContact(oldName);
                    System.out.println("Contact removed.");
                } else {
                    contactNotFoundError();
                }
                requestCommand();
                break;
            case (6):
                System.out.println("Name of contact to be replaced.");
                oldName = scanner.nextLine();
                exists = this.list.contactExists(oldName);
                if (exists) {
                    newName = receiveName(true);
                    newNumber = receivePhoneNumber();
                    contact = receiveNewContact(newName, newNumber);
                    this.list.replaceContact(oldName, contact);
                } else {
                    contactNotFoundError();
                }
                requestCommand();
                break;
            case (7):
                System.out.println("Quitting Program Now");
                endProgram();
                break;
            default:
                printInstructions();
                break;
        }
    }

    public void endProgram() {

    }

    public void contactNotFoundError() {
        System.out.println("Contact Not Found");
    }

    private Contact receiveContact(boolean newContact) {
        String name;
        String number;
        name = receiveName(true);
        if (!newContact) number = this.list.getPhoneNumber(name);
        else number = receivePhoneNumber();
        Contact contact = new Contact(name, number);
        return contact;
    }

    public void requestCommand() {
        System.out.println("Next command?  Enter \"1\" if you need to review the instructions");
        boolean nextIsInt = scanner.hasNextInt();
        if (nextIsInt) {
            int command = scanner.nextInt();
            scanner.nextLine();
            processUserInput(command);
        } else if (!nextIsInt) {
            scanner.nextLine();
            System.out.println("That is not a valid input");
            requestCommand();
        }
    }

    public void removeContact(String name) {
        this.list.removeContact(name);
    }

    public void editContact(String name, String number) {
        this.list.editContact(name, number);
    }

    public String receiveName(boolean newName) {
        String query = "";
        if (newName) query = "New Name:";
        else query = "Existing Name:";
        System.out.println(query);
        query = scanner.nextLine();
        return query;
    }

    public String receivePhoneNumber() {
        System.out.println("New Phone Number:");
        String number = scanner.nextLine();
        return number;
    }

    public Contact receiveNewContact(String name, String number) {
        Contact contact = new Contact(name, number);
        return contact;
    }

    public void addContact(Contact contact) {
        this.list.addContact(contact);
    }

    public void printContactList() {
        this.list.printAllContacts();
    }
}
