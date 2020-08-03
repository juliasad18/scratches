

// long to String
// String to ArrayList<Integer> --> with reversed order of numbers
// ArrayList to String --> without , between numbers !!!
// String to long

import java.util.*;
import java.util.stream.*;


class LongReversedOrder {
    public static long maxNumber(long n){

        String stringNumbers = String.valueOf(n);

        List<Integer> numberArrayList = new ArrayList<>();
        for (int i = 0; i < stringNumbers.length(); i++) {
            numberArrayList.add(Character.getNumericValue(stringNumbers.charAt(i)));
        }
        numberArrayList.sort(Comparator.reverseOrder());

        String stringOfReversedNumbers = numberArrayList.stream().map(Objects::toString).collect(Collectors.joining());

        String stringOfReversedNumbers2 = numberArrayList.stream().map(Objects::toString).reduce("", (acc, item)->acc + item);
        System.out.println("Result 2: " + stringOfReversedNumbers2);

        //String stringOfReversedNumbers3 = numberArrayList.stream().map(Objects::toString).reduce(new StringBuilder(""), (acc, item)->acc,(acc,item)->acc.append(item));

        long finalResultOfReversedNumbers = Long.parseLong(stringOfReversedNumbers);

        return finalResultOfReversedNumbers;
    }

    public static long maxNumber_Best (long n) {
        return Long.parseLong(  Arrays.stream((n + "").split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining())  );
    }

    public static void main(String[] args) {
        System.out.println(maxNumber(79797979));

    }
}