
import java.util.Scanner;

class SortArrayOfIntegers {

    public static Scanner scanner = new Scanner(System.in);

    public static int[] sortIntegers(int[] arrayOfNumbers) {

        boolean flag = true;
        int temp = 0;
        while(flag) {
            flag = false;
            for(int i = 0; i < arrayOfNumbers.length - 1; i++) {
                if(arrayOfNumbers[i] < arrayOfNumbers[i + 1]) {
                    temp = arrayOfNumbers[i];
                    arrayOfNumbers[i] = arrayOfNumbers[i + 1];
                    arrayOfNumbers[i + 1] = temp;
                    flag = true;
                }
            }

        }
        return arrayOfNumbers;

    }

    public static int[] getIntegers(int capacity) {
        System.out.println("Enter " + capacity + " numbers...");
        int[] arrayOfNumbers = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            int enteredNumber = scanner.nextInt();
            arrayOfNumbers[i] = enteredNumber;
       }

        return arrayOfNumbers;
    }

    public static void printArray(int[] arrayOfNumbers) {
        for(int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.println(arrayOfNumbers[i]);
        }
    }


    public static void main(String[] args) {

        //int[] testArray = sortIntegers(new int[]{1, 2, 3, 3, 0, 4, 5});
        //printArray(testArray);

        printArray(sortIntegers(getIntegers(5)));


        
    }
}