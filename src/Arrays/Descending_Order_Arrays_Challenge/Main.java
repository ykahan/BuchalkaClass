package Arrays.Descending_Order_Arrays_Challenge;

public class Main {
    public static void main(String[] args) {
        ArraysPrac arrays = new ArraysPrac();
        int[] arr = arrays.getArray();
        arrays.printArray(arr);
        System.out.println("Sorting...");
        arr = arrays.sortArray(arr);
        arrays.printArray(arr);
    }
}
