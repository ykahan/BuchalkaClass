package Arrays.Minimum_Element_Challenge;

public class Main {
    public static void main(String[] args) {
        ArraysPrac ap = new ArraysPrac();
        int[] arr = ap.readIntegers();
        int min = ap.findMin(arr);
        System.out.println("Minimum integer: " + min);
    }
}
