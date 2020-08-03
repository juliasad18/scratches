

import java.util.ArrayList;
import java.util.List;


class DeleteNhtElement {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {


        List<Integer> newList = new ArrayList<>();

        for (int number : elements) {

            if (!newList.contains(number) && maxOccurrences != 0) {
                newList.add(number);
            } else {
                int counter = 0;
                for (int numberInNewList : newList) {
                    if (number == numberInNewList) {
                        counter = counter + 1;
                        if (counter > maxOccurrences) {
                            break;
                        }
                    }
                }
                if (counter < maxOccurrences) {
                    newList.add(number);
                }
            }
        }

        int[] finalArray = newList.stream().mapToInt(Integer::intValue).toArray();


        return finalArray;
    }



    public static void main(String[] args) {

        int[] array = deleteNth(new int[] {1, 2, 2, 3, 1, 2, 3, 5, 5, 3, 2, 2, 2 }, 2);

        for (int i : array) {
            System.out.println(i);
        }
    }
}




