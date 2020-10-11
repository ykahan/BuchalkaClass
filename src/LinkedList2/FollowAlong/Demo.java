package LinkedList2.FollowAlong;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

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
            if (comp == 0) return false;
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
}
