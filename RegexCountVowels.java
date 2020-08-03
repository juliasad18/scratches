import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class RegexCountVowels {
    public static int getCount(String str) {
        Pattern pattern = Pattern.compile("[aeiou]");
        List<String> listOfVowels = new ArrayList<>();

        for (int i = 0; i < str.length();  i++){
            String letterString = String.valueOf(str.charAt(i));
            Matcher matcher = pattern.matcher(letterString);
            if (matcher.matches() == true){
                listOfVowels.add(letterString);
            }
        }

        int countOfVowels = Math.toIntExact(listOfVowels.stream().count());

        return countOfVowels;
    }

    public static int getCount_Best (String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }

    public static void main(String[] args) {
        System.out.println(getCount("abracadabra"));

    }
}