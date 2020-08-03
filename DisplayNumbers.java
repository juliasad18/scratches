import java.util.stream.IntStream;

class Scratch {

    public static String displayNumber (long number) {
        String displayResult = "";

        //create a list; turn list to string (result)
        //create two methods - with switch and with hashcode, check which is faster

        String stringNumber = String.valueOf(number);
        String[] stringArray = new String[stringNumber.length()];

        for (int i = 0; i < stringNumber.length(); i++) {
            int numberFromChar = Character.getNumericValue(stringNumber.charAt(i));

            switch (numberFromChar) {
                case 0:
                    displayResult = "._.\n" + "|.|\n" + "|_|\n";
                    break;
                case 1:
                    displayResult = "...\n" + "..|\n" + "..|\n";
                    break;
                case 2:
                    displayResult = "._.\n" + "._|\n" + "|_.\n";
                    break;
                case 3:
                    displayResult = "._.\n" + "._|\n" + "._|\n";
                    break;
                case 4:
                    displayResult = "...\n" + "|_|\n" + "..|\n";
                    break;
                case 5:
                    displayResult = "._.\n" + "|_.\n" + "._|\n";
                    break;
                case 6:
                    displayResult = "._.\n" + "|_.\n" + "|_|\n";
                    break;
                case 7:
                    displayResult = "._.\n" + "..|\n" + "..|\n";
                    break;
                case 8:
                    displayResult = "._.\n" + "|_|\n" + "|_|\n";
                    break;
                case 9:
                    displayResult = "._.\n" + "|_|\n" + "._|\n";
                    break;
            }

            stringArray[i] = displayResult;

        }

        String finalResult = String.join("", stringArray);



        return finalResult;
    }




    public static void main(String[] args) {

//        System.out.println(displayNumber(0));
        System.out.println(displayNumber(103));
//        System.out.println(displayNumber(2));
//        System.out.println(displayNumber(3));
//        System.out.println(displayNumber(4));
//        System.out.println(displayNumber(5));
//        System.out.println(displayNumber(6));
//        System.out.println(displayNumber(7));
//        System.out.println(displayNumber(8));
//        System.out.println(displayNumber(9));
    }

}