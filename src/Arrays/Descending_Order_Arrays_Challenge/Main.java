package Arrays.Descending_Order_Arrays_Challenge;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArraysPrac arrays = new ArraysPrac();
//        int[] arr = arrays.getArray();
//        arrays.printArray(arr);
//        System.out.println("Sorting...");
//        arr = arrays.sortArray(arr);
//        arrays.printArray(arr);

        ArrayList sal = new ArrayList<String>();
        sal.add("one");
        sal.add("two");
        sal.add("three");

        String[] first = new String[sal.size()];

        ArrayList sal2 = new ArrayList<String>();
        sal2.addAll(sal);

        sal2.add("four");

        ArrayList<String> sal3 = new ArrayList<String>(sal);


        for(int i = 0; i < sal.size(); i++){
            System.out.println("sal3 " + sal3.get(i));
        }

        String[] arr = new String[sal.size()];
        arr = (String[]) sal.toArray(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr.toString());
        }
    }
}
