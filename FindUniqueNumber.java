
import java.util.HashMap;
import java.util.Map;

class FindUniqueNumber {

    public static double findUnique (double arr[]) {
        double finalResult = 0;
        int one = 1;
        int counter = 0;

        HashMap<Double, Integer> temporaryList = new HashMap<>();

        for (double number : arr) {
            if (!temporaryList.containsKey(number)) {
                temporaryList.put(number, one);
            } else if (temporaryList.get(number) < 2) {
                counter = counter + one + 1;
                temporaryList.put(number, counter);
            }
        }

        for (Map.Entry<Double, Integer> entry : temporaryList.entrySet()) {
            if (entry.getValue().equals(1)) {
                finalResult = entry.getKey();
            }
        }

        return finalResult;
    }



    public static void main(String[] args) {

        System.out.println(findUnique(new double[] {1, 0, 0, 1, 0, 0, 0, 2.1, 0, 0.55, 0.55}));
    }
}




