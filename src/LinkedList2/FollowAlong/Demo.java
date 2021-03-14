package LinkedList2.FollowAlong;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> masechtosToLearn = new LinkedList<String>();
        masechtosToLearn.add("Brachos");
        masechtosToLearn.add("Shabbos");
        masechtosToLearn.add("Pesachim");
        printList(masechtosToLearn);
        masechtosToLearn.add(2, "Eiruvin");
        printList(masechtosToLearn);
        masechtosToLearn.add(2, "Eiruvin");
        printList(masechtosToLearn);
        masechtosToLearn.remove(2);
        printList(masechtosToLearn);
        removeAll(masechtosToLearn);
        printList(masechtosToLearn);
        addAlphabetically(masechtosToLearn, "Shabbos");
        addAlphabetically(masechtosToLearn, "Brachos");
        addAlphabetically(masechtosToLearn, "Eiruvin");
        addAlphabetically(masechtosToLearn, "Bava Kammma");
        printList(masechtosToLearn);
        addAlphabetically(masechtosToLearn, "Makkos");
        printList(masechtosToLearn);
        learn(masechtosToLearn);
    }

    public static void removeAll(LinkedList<String> ll){
        for(int index = ll.size() - 1; index >= 0; index--){
            ll.remove(index);
        }
    }

    public static boolean addAlphabetically(LinkedList<String> ll, String element){
        ListIterator<String> iter = ll.listIterator();
        while(iter.hasNext()){
            int comp = iter.next().compareTo(element);
            if (comp == 0) return false;  // element already in string, no need to add
            else if(comp > 0){
                // new element should appear before current element
                iter.previous();
                break;
            } else {
                continue;
            }
        }
        iter.add(element);
        return true;
    }

    public static void printList(LinkedList<String> ll){
        if(ll.size() > 0) {
            Iterator<String> iter = ll.iterator();
            while (iter.hasNext()) {
                System.out.println("Now learning " + iter.next());
            }
            System.out.println("Okay, we're done.\n");
        } else {
            System.out.println("No elements found.\n");
        }
    }

    private static void learn(LinkedList<String> ll){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> iter = ll.listIterator();
        if(ll.isEmpty()) {
            System.out.println("No masechtos found");
            return;
        } else {
            System.out.println("Now learning " + iter.next());
            printMenu();
        }
        while(!quit){
            String actionStr = scanner.nextLine();
            int actionInt = -1;
            try{
                actionInt = Integer.parseInt(actionStr);
            } catch(Exception e){
                System.out.println(e.getStackTrace());
                continue;
            }
            if(actionInt < 0 || actionInt > 3) {
                System.out.println("Invalid choice.  Try again.");
                continue;
            }
            switch(actionInt){
                case(0):
                    System.out.println("We're done now.");
                    quit = true;
                    break;
                case(1):
                    if(iter.hasNext()) System.out.println("Now learning " + iter.next());
                    else System.out.println("No later masechta found.");
                    break;
                case(2):
                    if(iter.hasPrevious()) System.out.println("Now learning " + iter.previous());
                    else System.out.println("No previous masechta found.");
                    break;
                case(3):
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Click...");
        System.out.println("0 to end app.");
        System.out.println("1 to go to next masechta");
        System.out.println("2 to go to previous masechta");
        System.out.println("3 to print menu");
    }
}
