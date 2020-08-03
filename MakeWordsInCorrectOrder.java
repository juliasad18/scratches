import java.util.*;

class MakeWordsInCorrectOrder {

    public static String order(String words) {
        String[] splitWordsArray = words.split(" ");
        int sequenceNumber = 0;
        String characterString = "";

        HashMap<Integer, String> hashMap = new HashMap<>();

        for (String i : splitWordsArray) {
            for(int k = 0; k < i.length(); k++) {
                characterString = String.valueOf(i.charAt(k));
                if (characterString.matches("[123456789]")) {
                    sequenceNumber = Integer.valueOf(characterString);
                    hashMap.put(sequenceNumber, i);
                }
            }
        }

        Collection<String> orderedWordsList = hashMap.values();
        String finalString = String.join(" ", orderedWordsList);

        return finalString;
    }

    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));
    }
}




