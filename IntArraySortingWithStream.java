import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class IntArraySortingWithStream {
    public static int minValue(int[] values){
        List<Integer> listOfValues = new ArrayList<Integer>();
        for (int i : values) {
            listOfValues.add(i);
        }

        int[] sortedList = listOfValues.stream().mapToInt(Integer::intValue).sorted().distinct().toArray();

        StringBuilder stringBuilder = new StringBuilder();
        String stringOfNumbers = "";
        for (int i : sortedList) {
            stringOfNumbers = stringBuilder.append(i).toString();
        }

        int finalResult = Integer.valueOf(stringOfNumbers).intValue();
        return finalResult;
    }

    //show how to use int[] array into stream  Arrays.stream(int[] {}})
    //make each int as string
    //collect those to String
    public static int minValue_Best (int[] values){
        String s = Arrays.stream(values)
                .sorted()
                .distinct()
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(""));
        return Integer.valueOf(s);
    }

    public static void main(String[] args) {
        System.out.println(minValue(new int[] {1,3,1,6,5,9,2}));


    }
}