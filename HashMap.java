
// HashMap

import java.util.*;

class Scratch {
    public static int findIt(int[] a) {
        int finalResult = 0;
        int count = 0;

        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i : a) {
            for (int k : a) {
                if (i == k && !(hashMap.containsKey(i))) {
                    count = count + 1;
                } else if (hashMap.containsKey(i)) {
                    break;
                }
            }
            if (!(hashMap.containsKey(i))) {
                hashMap.put(i, count);
                if (!(count % 2 == 0)) {
//                    for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
//                        if (entry.getValue().equals(count)) {
//                            finalResult = entry.getKey();
//                        }
//                    }
                    finalResult = i;
                    break;
                }
                count = 0;
            }
        }

        return finalResult;
    }

    public static int findIt2(int[] A) {
        int xor = 0;
        for (int i = 0; i < A.length; i++) {
            xor ^= A[i];
        }
        return xor;
    }

    public static int findIt3_theBest(int[] a) {
        int finalResult = 0;
        int count = 1;

        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i : a) {
            if (!(hashMap.containsKey(i))) {
                hashMap.put(i, count);
                count = 1;
            } else {
                int value = hashMap.get(i);
                hashMap.put(i, value + 1);
            }
        }


        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (!(entry.getValue() % 2 == 0)) {
                finalResult = entry.getKey();
                break;
            }
        }

        return finalResult;
    }


    public static void main(String[] args) {
//        System.out.println(findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));

        int[] array = new int[10000];

        for (int i = 0; i < array.length; i++){
            double randomDouble = Math.random() * 100;
            array[i] = (int)randomDouble;
        }

        Long start = System.currentTimeMillis();
        System.out.println(findIt(array));
        System.out.println(System.currentTimeMillis() - start);

    }
}