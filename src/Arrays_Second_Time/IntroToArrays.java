package Arrays_Second_Time;

public class IntroToArrays {
    public static void main(String[] args) {
        int[] someInts = new int[10];
        populateArray(someInts);
        printArray(someInts);
        System.out.println(getAverageOfArray(someInts));
    }

    private static void populateArray(int[] someInts) {
        for(int i = 0; i < someInts.length; i++){
            someInts[i] = (int)Math.pow(i, i);
        }
    }

    private static void printArray(int[] someInts) {
        for (int ele : someInts) {
            System.out.println(ele);
        }
    }

    private static double getAverageOfArray(int[] intArray){
        int cumulative = 0;
        for(int integer: intArray){
            cumulative += integer;
        }
        return cumulative / intArray.length;
    }

}
