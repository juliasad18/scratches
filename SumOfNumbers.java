
class SumOfNumbers {
    public static int digital_root(int n)  {
        int counter = 0;
        int finalSum = 0;

        String numberString = String.valueOf(n);

        while (numberString.length() > 1) {
            for (int i = 0; i < numberString.length(); i++) {
                counter = counter + Character.getNumericValue(numberString.charAt(i));
            }
            numberString = String.valueOf(counter);
            counter = 0;
        }

        finalSum = Integer.valueOf(numberString);

        return finalSum;
    }




    public static void main(String[] args) {

        System.out.println(digital_root(493193));

    }
}