import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        int[] luckyNumbers = new int[] { 4, 3, 4, 2, 3, 2, 3, 1, 4, 3};
        int[] copiedNumbers = Arrays.copyOf(luckyNumbers, luckyNumbers.length);

        // variant of quicksort
        Arrays.sort(luckyNumbers);
    }
}