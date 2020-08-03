import java.util.*;

class MixedSum {

    //Step 1. Create a method which will convert a list of different object types into a List Of Integers
    public static List<Integer> convertIntoListOfIntegers (List<?> listOfMixedObjects) {
        List<Integer> listOfIntegers = new ArrayList<>();
        for (Object object : listOfMixedObjects) {
            int finalSum;
            if (object instanceof String) {
                int i = Integer.valueOf((String) object);
                listOfIntegers.add(i);
            } else if (object instanceof Integer) {
                int k = Integer.valueOf((Integer) object);
                listOfIntegers.add(k);
            } else {
                System.out.println(object + " has an unsupported type");
            }

        }
        return listOfIntegers;

    }

    //Step 2. Final method which will return the sum of given strings and integers
    public static int sum (List<?> mixed) {
        int finalSum = 0;
        List<Integer> listOfIntegers = convertIntoListOfIntegers(mixed);
        for (Integer number : listOfIntegers) {
            finalSum = finalSum + number;
        }
        return finalSum;

    }
    public static void main(String[] args) {
        Long start = System.currentTimeMillis();
        System.out.println(sum(Arrays.asList(8, 0, 0, 8, 5, 7, 2, 3, 7, 8, 6, 7, "10", "8")));
        System.out.println(System.currentTimeMillis() - start);

    }
}