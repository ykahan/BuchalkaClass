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
        System.out.println("Enter 6 To Quit The Program");
        int response = scanner.nextInt();
        scanner.nextLine();
        processUserInput(response);
    }

    public void processUserInput(int response) {
        String name;
        String number;
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
                name = receiveName();
                number = receivePhoneNumber();
                addContact(name, number);
                requestCommand();
                break;
            case (4):
                name = receiveName();
                number = receivePhoneNumber();
                editContact(name, number);
                requestCommand();
                break;
            case (5):
                name = receiveName();
                removeContact(name);
                requestCommand();
                break;
            case (6):
                break;
            default:
                printInstructions();
                break;
        }
    }

    public void requestCommand() {
            System.out.println("Next command?  Enter \"1\" for instructions");
            boolean nextIsInt = scanner.hasNextInt();
            if (nextIsInt) {
                int command = scanner.nextInt();
                scanner.nextLine();
                processUserInput(command);
            } else if(!nextIsInt){
                scanner.nextLine();
                System.out.println("That is not a valid input");
                requestCommand();
            }
        }

        public void removeContact (String name){
            this.list.removeContact(name);
        }

        public void editContact (String name, String number){
            this.list.editContact(name, number);
        }

        public String receiveName () {
            System.out.println("Name:");
            String name = scanner.nextLine();
            return name;
        }

        public String receivePhoneNumber () {
            System.out.println("Number:");
            String number = scanner.nextLine();
            return number;
        }

        public void addContact (String name, String number){
            this.list.addContact(name, number);
        }

        public void printContactList () {
            this.list.printAllContacts();
        }
    }
