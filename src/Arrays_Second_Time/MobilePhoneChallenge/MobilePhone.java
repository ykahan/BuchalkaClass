package Arrays_Second_Time.MobilePhoneChallenge;

import java.util.Scanner;

public class MobilePhone {
    private ContactsList cl = new ContactsList();
    private static Scanner scanner = new Scanner(System.in);

    public void operatePhone() {
        printInstructions();
        boolean continueApp = true;
        while (continueApp) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    System.out.println(cl.toString());
                    break;
                case 2:
                    System.out.println("Name:");
                    String name = scanner.nextLine();
                    int index = cl.findContactByName(new Contact(name, "0"));
                    if (index == -1) {
                        System.out.println("Phone number:");
                        String phone = scanner.nextLine();
                        System.out.println("Storing new contact \"" + name + "\"");
                        cl.storeNewContact(new Contact(name, phone));
                        break;
                    } else {
                        System.out.println(name + " already present");
                        break;
                    }
                case 3:
                    System.out.println("Name:");
                    name = scanner.nextLine();
                    boolean found =
                            cl.searchForContactByName(new Contact(name, "0"));
                    if (!found) {
                        System.out.println(name + " not found");
                        break;
                    } else {
                        System.out.println("Phone number:");
                        String phone = scanner.nextLine();
                        System.out.println("Changing phone number of \"" + name + "\" to " + phone);
                        cl.modifyPhone(new Contact(name, phone));
                        break;
                    }
                case 4:
                    System.out.println("Name:");
                    name = scanner.nextLine();
                    found = cl.searchForContactByName(new Contact(name, "0"));
                    if (!found) {
                        System.out.println(name + " not found");
                        break;
                    } else {
                        System.out.println("Deleting \"" + name + "\"");
                        cl.deleteContact(new Contact(name, "0"));
                        break;
                    }
                case 5:
                    System.out.println("Name:");
                    name = scanner.nextLine();
                    int loc = cl.findContactByName(new Contact(name, "0"));
                    if (loc > -1) System.out.println(name + " appears at position " + loc);
                    else System.out.println(name + " not found");
                    break;
                case 6:
                    continueApp = false;
                    break;
            }
            System.out.println("Done, please enter new instruction");
        }
    }

    public static void printInstructions() {
        System.out.println("Press:");
        System.out.println("\t0 to print the instructions");
        System.out.println("\t1 to print the list of contacts");
        System.out.println("\t2 to create and add a new contact");
        System.out.println("\t3 to change the phone number of an existing contact");
        System.out.println("\t4 to delete an existing contact");
        System.out.println("\t5 to search for an existing contact");
        System.out.println("\t6 to shut down the app");
    }
}
