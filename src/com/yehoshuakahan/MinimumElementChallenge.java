package com.yehoshuakahan;

import java.util.Scanner;

public class MinimumElementChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public int readLength(){
        System.out.println("How long should the array be?");
        int length = scanner.nextInt();
        scanner.nextLine();
        return length;
    }

    public int[] readIntegers(int count){
        int[] array = new int[count];
        for(int i = 0; i < count; i++) {
            System.out.println("Please enter an integer.");
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }

    public int findMin(int[] array){
        int length = array.length;
        int min = array[0];
        for(int i = 0; i < length; i++){
            if (array[i] < min) min = array[i];
        }
        return min;
    }
}
