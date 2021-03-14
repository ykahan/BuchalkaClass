package Arrays_Second_Time;

public class Tester {
    public static void main(String[] args) {
        int size = SortNumericArray.getSize();
        int[] original = SortNumericArray.getIntegers(size);
        int[] sortedDesc = SortNumericArray.sortIntegersDesc(original);
        SortNumericArray.printArray(sortedDesc);
        int[] sortedAsc = SortNumericArray.sortIntegersAsc(original);
        SortNumericArray.printArray(sortedAsc);
    }
}
