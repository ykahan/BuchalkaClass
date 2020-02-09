package Arrays.Reverse_Array_Challenge;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Arrays_Prac ap = new Arrays_Prac();
        int[] arr = ap.readIntegers();
        System.out.println("arr before reverse: " + Arrays.toString(arr));
        int[] arr2 = ap.reverseArray(arr);
        System.out.println("arr after reverse: " + Arrays.toString(arr));
        System.out.println("arr2 from reverse: 5" + Arrays.toString(arr2));
    }
}
