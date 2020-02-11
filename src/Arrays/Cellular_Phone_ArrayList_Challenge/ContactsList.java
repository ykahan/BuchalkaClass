package Arrays.Cellular_Phone_ArrayList_Challenge;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContactsList {

    private ArrayList<Contact> contacts;
    private Scanner scanner;
    private boolean quit;

    public ContactsList() {
        this.contacts = new ArrayList<Contact>();
        this.scanner = new Scanner(System.in);
        this.quit = false;
    }

    public ContactsList(ArrayList<Contact> contacts) {
        this.contacts = contacts;
        this.scanner = new Scanner(System.in);
        this.quit = false;
    }

    public void callOption() {
        callOption(1);
    }

    public void callOption(int option) {
        String id;
        String newName;
        String newNumber;
        String interaction;
        int index;
        switch (option) {
            case 1:
                printOptions();
                break;

            case 2:
                showAllContacts();
                break;

            case 3:
                newName = getNewName();
                newNumber = getNewNumber();
                addContact(newName, newNumber);

                newName = "";
                newNumber = "";
                break;

            case 4:
                interaction = "modify";
                id = getId(interaction);
                index = locateContact(id);
                if (index > -1) {
                    newName = getNewName();
                    modifyName(id, newName);
                } else notFound();

                id = "";
                newName = "";
                interaction = "";
                break;

            case 5:
                interaction = "modify";
                id = getId(interaction);
                index = locateContact(id);
                if (index > -1) {
                    newNumber = getNewNumber();
                    modifyNumber(id, newNumber);
                } else notFound();

                id = "";
                newName = "";
                interaction = "";
                break;

            case 6:
                interaction = "replace";
                id = getId(interaction);
                index = locateContact(id);
                if (index > -1) {
                    newName = getNewName();
                    newNumber = getNewNumber();
                    replaceContact(id, newName, newNumber);
                } else notFound();

                id = "";
                newName = "";
                newNumber = "";
                interaction = "";
                break;

            case 7:
                interaction = "delete";
                id = getId(interaction);
                index = locateContact(id);
                if (index > -1) removeContact(id);
                else notFound();

                id = "";
                interaction = "";
                break;

            case 8:
                interaction = "find";
                id = getId(interaction);
                index = locateContact(id);
                if (index > -1) findContact(id);
                else notFound();

                id = "";
                interaction = "";
                break;

            case 9:
                interaction = "find";
                id = getName(interaction);
                printPhoneNumber(id);

                id = "";
                interaction = "";
                break;

            case 10:
                this.scanner = null;
                this.contacts = null;
                this.quit = true;
                break;
        }
        if (!this.quit) {
            int input = getNextInput();
            callOption(input);
        }
    }

    private int getNextInput() {
        int option = 9;
        boolean intReceived = false;
        while (!intReceived) {
            System.out.println("\nPick an option.");
            String input = scanner.nextLine();
            String regex = "[+-]?[0-9]+";  //pattern for integer
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(input);
            if (m.find() && m.group().equals(input)) {
                option = Integer.parseInt(input);
                if (option < 1 || option > 10) {
                    System.out.println("Integer must be within the range 1-10, inclusive.");
                } else {
                    intReceived = true;
                }
            } else System.out.println("User must input an integer within the range 1-10, inclusive.");
        }
        return option;
    }

    private void printPhoneNumber(String name){
        int index = locateContact(name);
        if(index > -1){
            String phoneNumber = contacts.get(index).getPhoneNumber();
            System.out.println("The phone number is: " + phoneNumber);
        } else notFound();
    }

    private void addContact(String name, String phoneNumber) {
        Contact contact = Contact.createContact(name, phoneNumber);
        int nameIndex = locateContact(name);
        int numberIndex = locateContact(phoneNumber);
        if(nameIndex == -1 && numberIndex == -1) contacts.add(contact);
        else System.out.println("That contact already exists.");
    }

    private int locateContact(String id) {
        for (int i = 0; i < contacts.size(); i++) {
            String contactName = contacts.get(i).getName();
            String phoneNumber = contacts.get(i).getPhoneNumber();
            if (contactName.toLowerCase().equals(id.toLowerCase())) return i;
            if (phoneNumber.equals(id)) return i;
        }

        return -1;
    }

    private void findContact(String id) {
        int index = locateContact(id);
        if (index > -1) {
            System.out.println("That is Contact #" + (index + 1));
            System.out.println(contacts.get(index).toString());
        }
        else notFound();
    }

    private void notFound() {
        System.out.println("Contact not found.");
    }

    private void removeContact(String id) {
        int index = locateContact(id);
        if (index > -1) contacts.remove(index);
        else notFound();
    }

    private void modifyNumber(String id, String newNumber) {
        int index = locateContact(id);
        if (index > -1) contacts.get(index).setPhoneNumber(newNumber);
        else notFound();
    }

    private void modifyName(String id, String newName) {
        int index = locateContact(id);
        if (index > -1) contacts.get(index).setName(newName);
        else notFound();
    }

    private void replaceContact(String id, String newName, String newNumber) {
        int index = locateContact(id);
        if (index > -1) {
            contacts.get(index).setName(newName);
            contacts.get(index).setPhoneNumber(newNumber);
        } else notFound();
    }

    private void showAllContacts() {
        if (contacts.size() > 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < contacts.size(); i++) {
                sb.append("Contact ");
                sb.append(i + 1);
                sb.append(")");
                sb.append(contacts.get(i).toString());
                System.out.println(sb.toString());

                sb.delete(0, sb.length());
            }
            sb = null;
        } else System.out.println("No contacts found.");
    }

    private void printOptions() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nOptions:");
        sb.append("\n1--Print Options");
        sb.append("\n2--See All Contacts");
        sb.append("\n3--Add New Contact");
        sb.append("\n4--Change Contact Name");
        sb.append("\n5--Change Contact Phone Number");
        sb.append("\n6--Replace Contact");
        sb.append("\n7--Delete Contact");
        sb.append("\n8--Find Contact");
        sb.append("\n9--Print Phone Number");
        sb.append("\n10--Quit");

        System.out.println(sb.toString());

        sb = null;
    }

    private String getNewName() {
        System.out.println("Name?\r");
        return scanner.nextLine();
    }

    private String getNewNumber() {
        System.out.println("Phone number?\r");
        return scanner.nextLine();
    }

    private String getId(String interaction) {
        System.out.println("What is the name or the phone number of the contact you want to " + interaction + "?\r");
        return scanner.nextLine();
    }

    private String getName(String interaction){
        System.out.println("What is the name of the contact you want to " + interaction + "?\r");
        return scanner.nextLine();
    }
}