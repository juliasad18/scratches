import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Multiplication {
    public static int persistence(long n) {
        long multiplication = 1;
        int finalResult = 0;

        String stringNumbers = String.valueOf(n);
        List<Long> listOfIterations = new ArrayList<>();

        while (stringNumbers.length() > 1) {
            for (int i = 0; i < stringNumbers.length(); i++) {
                multiplication = multiplication * Character.getNumericValue(stringNumbers.charAt(i));
            }
            listOfIterations.add(multiplication);
            stringNumbers = Arrays.stream((multiplication + "").split("")).reduce("", (a, b) -> a + b);
            multiplication = 1;
        }

        finalResult = listOfIterations.size();

        //Long.parseLong(  Arrays.stream((n + "").split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining())  )
        //String stringTest = Arrays.stream((n + "").split("")).reduce("", (a, b) -> a + b); //return string of all elements



        return finalResult;
    }


    public static void main(String[] args) {
        System.out.println(persistence(39));
        System.out.println(persistence(999));
        System.out.println(persistence(4));
        System.out.println(persistence(25));

    }
}