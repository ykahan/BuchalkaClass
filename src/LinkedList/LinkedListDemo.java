package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> places = new LinkedList<>();
        addInOrder(places, "Jerusalem");
        addInOrder(places, "Tel Aviv");
        addInOrder(places, "Beitar Ilit");
        addInOrder(places, "Haifa");
        addInOrder(places, "Kiryat Arba");
        addInOrder(places, "Mitzpe Ramon");
        addInOrder(places, "Eilat");

        printList(places);
        visit(places);
//        places.add(1, "Moshav Goren");
//        addInOrder(places, "Moshav Goren");
//        printList(places);
//
//        places.remove(4);
//        printList(places);
//
//        addInOrder(places, "Adelaide");
//        addInOrder(places, "Las Vegas");
//
//        addInOrder(places, "Las Vegas");
//        printList(places);
    }

    private static void printList(LinkedList<String> ll) {
        System.out.println("printing list...");
        Iterator<String> i = ll.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("===============================");
    }

    private static boolean addInOrder(LinkedList<String> ll, String city) {
        ListIterator<String> li = ll.listIterator();

        while (li.hasNext()) {
            int comparison = li.next().compareTo(city);
            if (comparison == 0) {
                // do not add, city's already in LinkedList
                return false;
            } else if (comparison > 0) {
                // new item should appear before current list element
                li.previous();
                li.add(city);
                return true;
            } else {
                // new item should appear after current list element
                // move on to next item for new comparison
            }
        }
        li.add(city); // adding city to end of LinkedList
        return true;
    }

    private static void visit(LinkedList ll){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<String> li = ll.listIterator();
        if(ll.isEmpty()) {
            System.out.println("Nothing found");
            return;
        } else {
            System.out.println("Current item: " + li.next());
            printMenu();
        }

        while(!quit){
            String action = scanner.nextLine();
            switch(action){
                case("0"):
                    System.out.println("Done");
                    quit = true;
                    break;
                case("1"):
                    if(li.hasNext()){
                        if(!forward) {
                            li.next();
                            forward = true;
                        }
                        System.out.println("Current item: " + li.next());

                    } else{
                        System.out.println("No items left");
                    }
                    break;
                case("2"):
                    if(li.hasPrevious()){
                        if(forward){
                            li.previous();
                            forward = false;
                        }
                        System.out.println("Current item: " + li.previous());
                    } else{
                        System.out.println("No earlier items");
                    }
                    break;
                default:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions:");
        System.out.println("0 to quit");
        System.out.println("1 for next");
        System.out.println("2 for previous");
        System.out.println("3 to print menu");
    }
}
