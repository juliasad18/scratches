import java.util.*;

class ExcludeWordCouples_Hardcoded {

    public static int wordCounter (List<String> givenList, String word) {
        int finalCount = 0;

        for (String i : givenList) {
            if (i == word) {
                finalCount = finalCount + 1;
            }
        }
        return finalCount;
    }

    public static List<String> dirReduc (String[] arr)  {
        List<String> givenList = Arrays.asList(arr);
        List<String> usefulList = new ArrayList<>();
        HashMap<String, Integer> hashMap = new HashMap();

        for (String i : givenList) {
            int count = wordCounter(givenList, i);
            hashMap.put(i, count);
        }

        if (!(hashMap.get("NORTH") == hashMap.get("SOUTH"))) {
            if (hashMap.get("NORTH") > hashMap.get("SOUTH")) {
                usefulList.add("NORTH");
            } else {
                usefulList.add("SOUTH");
            }
        } else if (!(hashMap.get("WEST") == hashMap.get("EAST"))) {
            if (hashMap.get("WEST") > hashMap.get("EAST")) {
                usefulList.add("WEST");
            } else {
                usefulList.add("EAST");
            }
        }
        return usefulList;
    }

    public static void main(String[] args) {

        System.out.println(dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));
        System.out.println(dirReduc(new String[]{"North", "South", "South", "East", "West", "North", "West"}));
    }
}




