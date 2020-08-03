
import java.util.Arrays;
import java.util.stream.Collectors;

class StreamSpinWords {

    public static String spinWords(String sentence) {

        String[] splittedString = sentence.split(" ");
        String[] resultString = new String[splittedString.length];

        int i = 0;
        for (String word : splittedString) {
            if (word.length() < 5) {
                resultString[i] = word;
                i++;
            } else {
                StringBuilder stringBuilder = new StringBuilder(word);
                String reversedWord = stringBuilder.reverse().toString();
                resultString[i] = reversedWord;
                i++;
            }
        }

        String finalResult = String.join(" ", resultString);
        return finalResult;
    }

    public static String spinWords_Stream(String sentence) {
        final String separator = " ";
        return Arrays.stream(sentence.split(separator)).map(word -> (word.length() < 5 ? word : new StringBuilder(word).reverse().toString())).collect(Collectors.joining(separator));
    }

    public static void main(String[] args) {
        System.out.println(spinWords_Stream("Hey fellow warriors"));
    }
}




