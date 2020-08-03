import java.util.*;

class DuplicatesCount {

    public static int duplicateCount(String text) {
        int duplicatesCount = 0;

        //can be combained with the next for () block!
        List<String> listOfLetters = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            listOfLetters.add(Character.toString(text.charAt(i)).toUpperCase());
        }

        HashMap<String, String> hashMap = new HashMap<>();

        for (String i : listOfLetters) {
            if (hashMap.containsKey(i)) {
                hashMap.put(i, "duplicate");
            } else {
                hashMap.put(i, "unique");
            }
        }

        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            if (entry.getValue().equals("duplicate")) {
                duplicatesCount = duplicatesCount + 1;
            }
        }

        return duplicatesCount;
    }






    public static void main(String[] args) {

        System.out.println(duplicateCount("indivisibilityD")); //2
    }
}




