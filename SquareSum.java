import java.util.*;
import java.util.stream.IntStream;

class SquareSum {
    public static int streamSquareSum(int[] n) {
        IntStream streamFromArrays = Arrays.stream(n);
        return streamFromArrays.map((s)->s*s).sum();
    }

    public static int squareSum(int[] n) {
        int finalResult = 0;
        for (int number : n) {
            finalResult = finalResult + (number * number);
        }
        return finalResult;
    }


    public static void main(String[] args) {
        System.out.println(squareSum(new int[]{1, 2, 2}));

    }
}