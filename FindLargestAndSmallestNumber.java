import java.util.Arrays;

class FindLargestAndSmallestNumber {
    public static String highAndLow(String numbers){

        String[] splitList = numbers.split(" ");
        int[] listOfNumbers = new int[splitList.length];
        int counter = 0;
        for (String string : splitList) {
            listOfNumbers[counter] = Integer.parseInt(string);
            counter++;
        }

        int largestNumber = listOfNumbers[0];
        int smallestNumber = listOfNumbers[0];
        for (int number : listOfNumbers) {
            int compareLargest = Integer.compare(largestNumber, number);
            int compareSmallest = Integer.compare(smallestNumber, number);
            if (compareLargest == -1) {
                largestNumber = number;
            } else if (compareSmallest == 1) {
                smallestNumber = number;
            }
        }

        String finalString = String.join(" ", String.valueOf(largestNumber), String.valueOf(smallestNumber));


        return finalString;
    }

    public static String HighAndLow_best(String numbers) {

        int min = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .min()
                .getAsInt();

        int max = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .max()
                .getAsInt();

        return String.format("%d %d", max, min);
    }

    public static void main(String[] args) {

        System.out.println(HighAndLow_best( "8 3 -5 42 -1 0 0 -9 4 7 4 -4" ));
    }
}




