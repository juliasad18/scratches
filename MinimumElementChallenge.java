import java.util.Scanner;

class MinimumElementChallenge {

    public static Scanner scanner = new Scanner(System.in);

    public static int[] readIntegers(int enteredNumbersCount) {
        System.out.println("Enter " + enteredNumbersCount + " numbers...");
        int[] arrayOfNumbers = new int[enteredNumbersCount];
        for (int i = 0; i < enteredNumbersCount; i++) {
            int enteredNumber = scanner.nextInt();
            arrayOfNumbers[i] = enteredNumber;
        }
        return arrayOfNumbers;
    }

    public static int findMin(int[] array) {
        int min = array[0];

        for(int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(findMin(readIntegers(8)));
    }
}