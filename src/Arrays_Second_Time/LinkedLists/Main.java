package Arrays_Second_Time.LinkedLists;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer Yehoshua = new Customer("Yehoshua", 43.23);
        Customer Josh;
        Josh = Yehoshua;
        Josh.setBalance(12.18);
        System.out.println("Yehoshua's Balance: " + Yehoshua.getBalance());
        System.out.println("Josh's Balance: " + Josh.getBalance());

        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(3);
        ints.add(4);

        int index = 2;
        int target = 49;

        ints.add(index, target);

        for (int i = 0; i < ints.size(); i++) {
            System.out.println(i +" ---> " + ints.get(i));
        }
    }

}
