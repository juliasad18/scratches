import java.util.Arrays;
import java.util.stream.IntStream;
import static java.util.Arrays.stream;

class OddOrEven {
    public static String oddOrEven(int[] array) {
        String oddOrEven = "";
        IntStream streamFromArrays = stream(array);
        int sum = streamFromArrays.sum();
        System.out.println(sum);
        if (sum % 2 == 0) {
            oddOrEven = "even";
        } else {
            oddOrEven = "odd";
        }
        return oddOrEven;
    }

    static String oddOrEven_best (final int[] array) {
        return stream(array).sum() % 2 == 0 ? "even" : "odd";
    }


    public static void main(String[] args) {
        System.out.println(oddOrEven(new int[] {2, 5, 34, 6}));
    }
}