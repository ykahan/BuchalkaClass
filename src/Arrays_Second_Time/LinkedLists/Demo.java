package Arrays_Second_Time.LinkedLists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> places = new LinkedList<>();
        places.add("Jerusalem");
        places.add("Betar Ilit");
        places.add("Bet Shemesh");
        places.add("Yokneam");

        printList(places);

        places.remove(3);
        printList(places);

        LinkedList<String> names = new LinkedList<>();
        addInOrder(names, "Yitzchok");
        addInOrder(names, "Moshe");
        addInOrder(names, "Yaakov");
        addInOrder(names, "Avrohom");
        addInOrder(names, "Zebedtov");
        printList(names);

        greet(names);
    }

    public static void printList(LinkedList<String> list) {
        for (String s : list) {
            System.out.println("Now visiting " + s);
        }
        System.out.println("Bye kids");
    }

    public static boolean addInOrder(LinkedList<String> list, String city) {
        ListIterator<String> iter = list.listIterator();

        while (iter.hasNext()) {
            int comparison = iter.next().compareTo(city);
            if (comparison == 0) {
                // city is identical to current
                System.out.println(city + " is already in list");
                return false;
            } else if (comparison > 0) {
                // new city is alphabetically prior to
                System.out.println(city + " should appear before this one");
                iter.previous();
                iter.add(city);
                return true;
            } else {
                // new city is alphabetically later
                System.out.println(city + " should be later in the list");
            }
        }
        iter.add(city);
        return true;
    }

    private static void greet(LinkedList names) {
        Scanner scanner = new Scanner(System.in);
        boolean continuing = true;
        boolean forward = true;
        ListIterator<String> iter = names.listIterator();
        if (names.isEmpty()) System.out.println("Nobody to greet.");
        else {
            System.out.println("Greeting " + iter.next());
            printMenu();
        }

        while(continuing){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("Bye kids");
                    continuing = false;
                    break;
                case 1:
                    if(!forward) {
                        forward = true;
                        if(iter.hasNext()) iter.next();
                    }
                    if(iter.hasNext()) System.out.println("Greeting " + iter.next());
                    else {
                        System.out.println("Reached the end of the chain");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward) {
                        forward = false;
                        if(iter.hasPrevious()) iter.previous();
                    }
                    if(iter.hasPrevious()) System.out.println("Greeting " + iter.previous());
                    else {
                        System.out.println("Reached the start of the chain");
                        forward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Press:");
        System.out.println("\t0 to quit");
        System.out.println("\t1 to greet next person");
        System.out.println("\t2 to greet previous person");
        System.out.println("\t3 to print menu");
    }
}
