import java.util.*;

class ReverseString {
    //My solution
    public static String solution(String str)  {
        StringBuilder builder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            builder.append(str.charAt(i));
        }
        return builder.toString();
    }
    //Better solution
    public static String bestPracticeSolution(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("World"));
        System.out.println(bestPracticeSolution("World"));

    }
}