package Arrays.Descending_Order_Arrays_Challenge;

import java.util.Scanner;

public class ArraysPrac {
    public int[] getArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many integers?\r");
        int numInts = Integer.parseInt(scanner.nextLine());
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


    public int[] sortArray(int[] arr){
        int c = 0;
        boolean swapped = false;
        for(int i = 0; i < arr.length - 1; i++){
            if (arr[i] < arr[i + 1]){
                c = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = c;
                swapped = true;
            }
        }
        if(swapped) return sortArray(arr);
        else return arr;
    }

    public void printArray(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < arr.length - 1; i++){
            sb.append(arr[i]);
            sb.append(", ");
        }
        sb.append(arr[arr.length - 1]);
        sb.append("]");
        System.out.println(sb.toString());
    }
}
