package ReferenceTypesAndValueTypes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int myInt1 = 10;
        int myInt2 = myInt1;
        System.out.println(myInt1);
        System.out.println(myInt2);
        System.out.println(myInt1 == myInt2);

        myInt2++;
        System.out.println(myInt1);
        System.out.println(myInt2);
        System.out.println(myInt1 == myInt2);

        int[] intArray1 = new int[5];
        int[] intArray2 = intArray1;

        System.out.println(Arrays.toString(intArray1));
        System.out.println(Arrays.toString(intArray2));
        intArray2[2] = 2;

        System.out.println(Arrays.toString(intArray1));
        System.out.println(Arrays.toString(intArray2));
    }
}
