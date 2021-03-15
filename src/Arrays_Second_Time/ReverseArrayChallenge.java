package Arrays_Second_Time;

import java.util.Arrays;

public class ReverseArrayChallenge {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    private static void reverse(int[] array){
        int[] tempArray = new int[array.length];
        for(int i = 0; i < array.length; i++){
            tempArray[i] = array[array.length - 1 - i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = tempArray[i];
        }

    }
}
