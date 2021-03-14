package Arrays_Second_Time;

import java.util.Scanner;

public class SortNumericArray {
    static Scanner scanner = new Scanner(System.in);

    static void printArray(int[] sorted){
        if(sorted.length > 0){
            System.out.print("[");
            for (int i = 0; i < sorted.length - 1; i++) {
                System.out.print(sorted[i] + ", ");
            }
            System.out.println(sorted[sorted.length - 1] + "]");
        } else {
            System.out.println("Null array");
        }
    }

    static int[] sortIntegersAsc(int[] original){
        int[] desc = sortIntegersDesc(original);
        int[] asc = new int[desc.length];
        for(int i = 0; i < asc.length; i++){
            asc[i] = desc[desc.length - 1 - i];
        }
        return asc;
    }

    static int[] sortIntegersDesc(int[] original){
        int i = isDescending(original);
        if(i == -1) return original;

        int temp = original[i];
        original[i] = original[i - 1];
        original[i - 1] = temp;

        return sortIntegersDesc(original);
    }

    private static int isDescending(int[] original) {
        boolean isDescending;
        for(int i = 1; i < original.length; i++){
            isDescending = original[i] <= original[i - 1];
            if(!isDescending) return i;
        }
        return -1;
    }

    static int[] getIntegers(int size){
        int[] original = new int[size];

        for(int i = 0; i < original.length; i++){
            System.out.println("Integer #" + (i + 1) + ":");
            original[i] = scanner.nextInt();
        }

        System.out.println("Ok, done.");
        return original;
    }

    static int getSize() {
        System.out.println("Number of integers:");
        int size = scanner.nextInt();

        if(size < 0){
            System.out.println("Negative integers not acceptable, try again.");
            return getSize();
        }

        return size;
    }
}
