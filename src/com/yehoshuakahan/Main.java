package com.yehoshuakahan;

public class Main {

    public static void main(String[] args) {
        NewArray na = new NewArray();
        na.getIntegers();
        na.printArray();
        int[] sorted = na.sortArray();
        int[] reversed = na.reverseArray(sorted);
        na.printArray(sorted);
    }
}
