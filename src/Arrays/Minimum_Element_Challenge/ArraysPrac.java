package Arrays.Minimum_Element_Challenge;

import java.util.Scanner;

public class ArraysPrac {
    public int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many integers?\r");
        int numInts = Integer.parseInt(scanner.nextLine());
        while(numInts < 1){
            System.out.println("Sorry, you must enter more than 0 integers into this array");
            System.out.println("How many integers?\r");
            numInts = Integer.parseInt(scanner.nextLine());
        }
        int[] array = new int[numInts];
        for(int i = 0; i < numInts; i++){
            System.out.println("Integer?\r");
            try {
                array[i] = Integer.parseInt(scanner.nextLine());
            } catch(Exception e){
                i -= 1;
            }
        }
        scanner = null;
        return array;
    }

    public int findMin(int[] arr){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min) min = arr[i];
        }
        return min;
    }
}
