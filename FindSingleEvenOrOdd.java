import java.util.*;
//import javax.ws.rs.core.MultivaluedMap;

class FindSingleEvenOrOdd {

    //works only if no duplicates
    public static int find(int[] integers)  {
        int oddCount = 0;
        int evenCount = 0;
        int finalResult = 0;

        HashMap<Integer, String> hashMap = new HashMap();

        //MultivaluedHashMap<Integer, String> queryParameters = new MultivaluedHashMap();

        for (int i : integers) {
            if (i % 2 == 0) {
                hashMap.put(i, "even");
            } else {
                hashMap.put(i, "odd");
            }
        }

        evenCount = Collections.frequency(hashMap.values(), "even");
        oddCount = Collections.frequency(hashMap.values(), "odd");

        if (evenCount == 1) {
            for (Map.Entry<Integer, String> mapEntry : hashMap.entrySet()) {
                if (mapEntry.getValue().equals("even")) {
                    finalResult = mapEntry.getKey();
                }
            }
        } else if (oddCount == 1) {
            for (Map.Entry<Integer, String> mapEntry : hashMap.entrySet()) {
                if (mapEntry.getValue().equals("odd")) {
                    finalResult = mapEntry.getKey();
                }
            }
        }

        return finalResult;
    }

    public static int find2(int[] integers) {
        int countEven = 0;
        int countOdd = 0;
        int finalResult = 0;

        for (int i : integers) {
            if (i % 2 == 0) {
                countEven = countEven +1;
            } else {
                countOdd = countOdd + 1;
            }
        }

        if (countEven == 1) {
            for (int i : integers) {
                if (i % 2 == 0) {
                    finalResult = i;
                    break;
                }
            }
        } else if (countOdd == 1) {
            for (int i : integers) {
                if (!(i % 2 == 0)) {
                    finalResult = i;
                    break;
                }
            }
        }

        return finalResult;

    }




    public static void main(String[] args) {

        System.out.println(find2(new int[] {0, 0, 0, 1})); //3

    }
}