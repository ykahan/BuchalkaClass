package LinkedList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer yehoshua = new Customer("Yehoshua", 2.45);
        Customer josh;
        josh = yehoshua;
        josh.setBalance(5.62);
        System.out.println("Balance for " + yehoshua.getName() + " is $" + yehoshua.getBalance());
        System.out.println("Josh's name is " + josh.getName());
        josh.setName("Frank");
        System.out.println("Now Yehoshua's name is " + yehoshua.getName());
        ArrayList<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        for(int i = 0; i < ints.size(); i++){
            System.out.println("Value " + (i + 1) + " is " + ints.get(i));
        }

        int index = 1;
        ints.add(index, 2);
        System.out.println("============================");
        System.out.println("Addind value 2 at index 1");
        System.out.println("============================");
        for(int i = 0; i < ints.size(); i++){
            System.out.println("Value " + (i + 1) + " is " + ints.get(i));
        }
    }
}
