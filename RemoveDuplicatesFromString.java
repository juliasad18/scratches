import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class RemoveDuplicatesFromString {
    public static String removeDuplicateWords(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        String[] newString = stringBuilder.toString().split(" ");

        List<String> listArrayString  = Arrays.asList(newString);
        List<String> finalListWithoutDuplicates = new ArrayList<>();

        for (int i = 0; i < listArrayString.size(); i++) {
            if (!finalListWithoutDuplicates.contains(listArrayString.get(i))) {
                finalListWithoutDuplicates.add(listArrayString.get(i));
            }
        }
        String finalString = String.join(" ", finalListWithoutDuplicates);

        return finalString;

    }

    public static String removeDuplicateWords_best1 (String s){
        return Arrays.stream( s.split("\\s+")).distinct().collect(Collectors.joining(" ") );
    }


    public static void main(String[] args) {
        System.out.println(removeDuplicateWords("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));


    }
}