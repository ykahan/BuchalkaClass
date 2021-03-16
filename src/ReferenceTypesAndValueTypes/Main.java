package ReferenceTypesAndValueTypes;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final GroceryList gl = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress:");
        System.out.println("\t0 for options");
        System.out.println("\t1 to print the grocery list");
        System.out.println("\t2 to add an item to the list");
        System.out.println("\t3 to modify an item on the list");
        System.out.println("\t4 to delete an item from the list");
        System.out.println("\t5 to search for an item on the list");
        System.out.println("\t6 to quit the app");
    }

    public static void addItem() {
        System.out.println("Please enter your item");
        gl.addGroceries(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Enter item to change");
        String itemToChange = scanner.nextLine();
        int index = getIndexOfItem(itemToChange);
        if (index > -1) {
            System.out.println("Enter replacement item");
            String newItem = scanner.nextLine();
            gl.changeItem(index, newItem);
            System.out.println(itemToChange + " replaced with " + newItem);
        } else System.out.println(itemToChange + " not found");
    }

    public static void removeItem() {
        System.out.println("Enter item to delete");
        String itemToDelete = scanner.nextLine();
        int itemNum = getIndexOfItem(itemToDelete);
        if(itemNum != -1) {
            gl.removeItem(itemNum - 1);
            System.out.println(itemToDelete + " deleted");
        } else {
            System.out.println(itemToDelete + " not found");
        }
    }

    public static int getIndexOfItem(String item) {
        return gl.findItem(item);
    }

    public static void searchForItem() {
        System.out.println("Enter item to search for");
        String targetItem = scanner.nextLine();
        int index = gl.findItem(targetItem);
        if (index != -1) {
            System.out.println("Found " + targetItem + " at position " +
                    (index + 1) + " on the list");
        }
        else System.out.println(targetItem + " not found");
    }

    public static void printGroceryList() {
        gl.printList();
    }
}
