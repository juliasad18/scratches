import java.util.*;

class MixedSum_BestPractise {


    public static int sum(List<?> mixed) {
        return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
        //Integer.parseInt(o.toString()) - converts all the objects to String and after that converts all the objects to Integer (parseInt)

    }

    public static void main(String[] args) {

        Long start = System.currentTimeMillis();
        System.out.println(sum(Arrays.asList(8, 0, 0, 8, 5, 7, 2, 3, 7, 8, 6, 7, "10", "8")));
        System.out.println(System.currentTimeMillis() - start);
    }

}
