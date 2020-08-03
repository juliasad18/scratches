import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexVowel {
    public static boolean isVowel(String s) {
        String lowerCaseString = s.toLowerCase();
        Pattern pattern = Pattern.compile("[aeiou]");
        Matcher matcher = pattern.matcher(lowerCaseString);
        return matcher.matches();
    }

    public static boolean isVowel_best (String s) {

        return s.matches("[aeiouAEIOU]");
    }

    public static void main(String[] args) {
        System.out.println(isVowel("a"));
        System.out.println(isVowel("E"));
        System.out.println(isVowel("ou"));
        System.out.println(isVowel("z"));
        System.out.println(isVowel("lol"));
    }
}