package com.yehoshuakahan;

public class Main {

    public static void main(String[] args) {
        MinimumElementChallenge mec = new MinimumElementChallenge();
        int count = mec.readLength();
        int[] array = mec.readIntegers(count);
        int min = mec.findMin(array);
        System.out.println("minimum value found: " + min);
    }
}
