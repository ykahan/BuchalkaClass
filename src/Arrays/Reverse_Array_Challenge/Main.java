package Arrays.Reverse_Array_Challenge;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Arrays_Prac ap = new Arrays_Prac();
        int[] arr = ap.readIntegers();
        int[] arr2 = ap.reverseArray(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}
