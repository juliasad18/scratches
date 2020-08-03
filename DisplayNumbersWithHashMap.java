import java.util.HashMap;
import java.util.Map;

class Scratch {

    public static HashMap<Integer, String> findNumber (int number) {

        HashMap<Integer, String> hashMap = new HashMap<>();

        switch (number) {
            case 0:
                hashMap.put(1, "._.");
                hashMap.put(2, "|.|");
                hashMap.put(3, "|_|");
                break;
            case 1:
                hashMap.put(1, "...");
                hashMap.put(2, "..|");
                hashMap.put(3, "..|");
                break;
            case 2:
                hashMap.put(1, "._.");
                hashMap.put(2, "._|");
                hashMap.put(3, "|_.");
                break;
        }


        return hashMap;
    }

    public static void displayNumber (String number) {
        String firstRowString = "";
        String secondRowString = "";
        String thirdRowString = "";



        for (int i = 0; i < number.length(); i++) {
            int numberFromChar = Character.getNumericValue(number.charAt(i));
            HashMap numberHashMap = findNumber(numberFromChar);
            String temp = numberHashMap.get(1).toString();
            firstRowString = firstRowString + " " + numberHashMap.get(1).toString();
            secondRowString = secondRowString + " " + numberHashMap.get(2).toString();
            thirdRowString = thirdRowString + " " + numberHashMap.get(3).toString();



        }

        System.out.println(firstRowString);
        System.out.println(secondRowString);
        System.out.println(thirdRowString);


    }


    public static void main(String[] args) {
        displayNumber("01202");
        
    }
}