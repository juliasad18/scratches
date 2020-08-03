import java.util.*;

class ExcludeWordCouples {

    public static int indexIfPairExists (List<String> givenList, String word) {
        int indexToRemovePair = -1;
        for (String i : givenList) {
            String uppercase = i.toUpperCase();
            if (uppercase.equals(word)) {
                indexToRemovePair = givenList.indexOf(i);
            }
        }
        return indexToRemovePair;
    }

    public static List<String> dirReduc (String[] arr)  {
        List<String> givenList = Arrays.asList(arr);
        List<String> finalList = new ArrayList<>();
        HashMap<String, String> listOfRules = new HashMap();

        listOfRules.put("NORTH", "SOUTH");
        listOfRules.put("SOUTH", "NORTH");
        listOfRules.put("EAST", "WEST");
        listOfRules.put("WEST", "EAST");

        for (String word : givenList) {
            String uppercaseWord = word.toUpperCase();
            String pair = listOfRules.get(uppercaseWord);
            int indexToRemove = indexIfPairExists(finalList, pair);

            if (!(indexToRemove == -1)) {
                finalList.remove(indexToRemove);
            } else {
                finalList.add(word);
            }

        }
        return finalList;
    }

    public static void main(String[] args) {
        System.out.println(dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));
        System.out.println(dirReduc(new String[]{"North", "South", "SoUth", "East", "West", "North", "West"}));
//        System.out.println(indexIfPairExists(Arrays.asList(new String[]{"South", "South", "East", "West", "North", "West"}), "NORTH"));
    }
}




