package Arrays_Second_Time;

import java.util.Scanner;

public class MinimumElementChallenge {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many integers?");
        int count = scanner.nextInt();
        int[] integers = readIntegers(count);
        int smallestInteger = findMin(integers);
        System.out.println("Minimum integer: " + smallestInteger);
    }

    static int[] readIntegers(int count){
        int[] integers = new int[count];
        for (int i = 0; i < count; i++) {
            integers[i] = scanner.nextInt();
        }
        return integers;
    }

    static int findMin(int[] array){
        int min = array[0];
        for (int integer:
             array) {
            if(integer < min) min = integer;
        }
        return min;
    }
}
