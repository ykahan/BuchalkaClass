package LinkedList2.FollowAlong;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> masechtosToLearn = new LinkedList<String>();
        addMasechtos(masechtosToLearn);
        printList(masechtosToLearn);
        masechtosToLearn.add(2, "Eiruvin");
        printList(masechtosToLearn);
    }

    public static void addMasechtos(LinkedList<String> ll){
        ll.add("Brachos");
        ll.add("Shabbos");
        ll.add("Pesachim");
    }

    public static void printList(LinkedList<String> ll){
        Iterator<String> iter = ll.iterator();
        while(iter.hasNext()){
            System.out.println("Now learning " + iter.next());
        }
        System.out.println("Okay, we're done.\n");
    }
}
