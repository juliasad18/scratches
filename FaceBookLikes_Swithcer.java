import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class FaceBookLikes_Swithcer {

    public static String whoLikesIt(String... names) {
        String finalResult = "";
        int arraySize = names.length;

        if (arraySize == 0) {
            finalResult = "no one likes this";
        } else if (arraySize == 1) {
            finalResult = String.join("", names) + " likes this";
        }else if (arraySize == 2) {
            finalResult = Arrays.stream(names).collect(Collectors.joining(" and ", "", " like this"));
        } else if (arraySize == 3) {
            String firstElement = names[0];
            List<String> list = new ArrayList(Arrays.asList(names));
            list.remove(0);
            finalResult = list.stream().collect(Collectors.joining(" and ", firstElement + ", ", " like this"));
        } else {
            List<String> list = new ArrayList<>();
            list.add(names[0]);
            list.add(names[1]);
            int othersCount = names.length - 2;
            finalResult = list.stream().collect(Collectors.joining(", ", "", " and " + othersCount + " others like this"));
        }
        return finalResult;
    }

    public static String whoLikesIt_best (String... names) {
        switch (names.length) {
            case 0: return "no one likes this";
            case 1: return String.format("%s likes this", names[0]);
            case 2: return String.format("%s and %s like this", names[0], names[1]);
            case 3: return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
            default: return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}




