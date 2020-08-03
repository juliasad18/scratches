import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

class RegexReturnPhoneNumberFormat {

    public static String createPhoneNumber(int[] numbers) {
        String charSequence = "";
        String pattern = "(\\d{3})(\\d{3})(\\d{4})";
        String replacement = "($1) $2-$3";

        String stringNumber = Arrays.stream(numbers).mapToObj(String::valueOf).collect(Collectors.joining(charSequence));

        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(stringNumber);

        String finalNumber = matcher.replaceAll(replacement);

        return finalNumber;
    }

    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}




