import java.util.*;

class TurnLongToReverseIntArray {
    public static int[] digitize(long n) {

        Long longToString = new Long(n);
        String reversedStringValue = new StringBuilder(longToString.toString()).reverse().toString();
        int[] reversedArray = new int[reversedStringValue.length()];
        for (int i = 0; i < reversedStringValue.length(); i++) {
            char charNumber = reversedStringValue.charAt(i);
            int number = Character.getNumericValue(charNumber);
            reversedArray[i] = number;
        }
        return reversedArray;
    }




    public static void main(String[] args) {
//        System.out.println(digitize(new int[] {1, 2, 2}));
        digitize(12349);

    }
}