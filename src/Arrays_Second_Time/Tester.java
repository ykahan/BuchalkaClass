package Arrays_Second_Time;

public class Tester {
    public static void main(String[] args) {
        int size = DownSort.getSize();
        int[] original = DownSort.getIntegers(size);
        int[] sorted = DownSort.sortIntegers(original);
        DownSort.printArray(sorted);
    }
}
