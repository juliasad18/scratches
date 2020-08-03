import java.util.*;

public class DuplicateEncoder_BestPractise_Modified {
    static String encode(String word){
        word = word.toLowerCase();
        String result = "";
        StringBuilder builder = new StringBuilder();
        long wordLength = word.length();
        for (int i = 0; i < wordLength; ++i) {
            char c = word.charAt(i);
            result = word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
            builder.append(result);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String word = "Prespecialized";
        Long start = System.currentTimeMillis();
        System.out.println(encode(word));
        System.out.println(System.currentTimeMillis() - start);

    }
}

