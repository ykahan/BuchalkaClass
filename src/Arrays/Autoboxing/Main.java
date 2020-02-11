package Arrays.Autoboxing;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        for(int i = 0; i < 1000; i++){
            // "boxing" the primitive int into an Integer object so that ArrayList can work with it.
            Integer integer = Integer.valueOf(i);
            // could also use this:
            // Integer integer = i;


            intList.add(integer);
        }

        for(int i = 0; i < 1000; i++){
            //"unboxing" and using the int in the Integer
            System.out.println(intList.get(i).intValue());
        }

        Integer integer = 71;  // equivalent of Integer integer = Integer.valueOf(71);
    }
}
