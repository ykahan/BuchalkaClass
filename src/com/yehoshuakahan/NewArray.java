package com.yehoshuakahan;

import java.util.Scanner;

public class NewArray {
    private int[] ints;
    private static Scanner scanner = new Scanner(System.in);

    public void getIntegers() {
        int arrayLength = howManyIntegers();
        ints = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            ints[i] = getInt();
        }
        scanner.close();
    }

    public int[] sortArray() {
        return sortArray(ints);
    }

    public int[] sortArray(int[] oldArray) {
        int length = oldArray.length;
        int[] newArray = new int[length];
        newArray[0] = oldArray[0];
        for (int oldArrayIndex = 1; oldArrayIndex < length; oldArrayIndex++) {
            int oldValue = oldArray[oldArrayIndex];
            for (int newArrayIndex = 0; newArrayIndex < length; newArrayIndex++) {
                int newValue = newArray[newArrayIndex];
                if (oldValue < newValue) {
                    for (int revIndex = length - 2; revIndex >= newArrayIndex; revIndex--) {
                        newArray[revIndex + 1] = newArray[revIndex];
                    }
                    newArray[newArrayIndex] = oldValue;
                    break;
                } else {
                    newArray[oldArrayIndex] = oldValue;
//                    printArray(newArray);
                }
            }
        }
        return newArray;
    }

    public int[] reverseArray(int[] oldArray){
        int length = oldArray.length;
        int[] newArray = new int[length];
        for(int i = 0; i < length; i++){
            newArray[length - 1 - i] = oldArray[i];
        }
        return newArray;
    }

    public void printArray() {
        printArray(ints);
    }

    public void printArray(int[] array) {
        System.out.print("[");
        int length = ints.length;
        for (int i = 0; i < length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[ints.length - 1] + "]\n");
    }

    private int getInt() {
        int answer = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the next integer?");
        if (scanner.hasNextInt()) {
            answer = scanner.nextInt();
        } else {
            printNotIntError();
            answer = getInt();
        }
        return answer;
    }

    private void printNotIntError() {
        System.out.println("That is not an integer.");
        System.out.println("Let's try again.");
    }

    private void printNotPositiveIntError() {
        System.out.println("That integer is not positive.");
        System.out.println("Please try again with a positive integer.");
    }

    private int howManyIntegers() {
        int answer = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many integers should there be?");
        if (!scanner.hasNextInt()) {
            printNotIntError();
            answer = howManyIntegers();
        } else {
            answer = scanner.nextInt();
            if (answer <= 0) {
                printNotPositiveIntError();
                answer = howManyIntegers();
            }
        }
        return answer;
    }
}
