

class EvenOrOdd {
    public static String even_or_odd(int number){
        String finalString = "";

        if (number % 2 == 0) {
            finalString = "Even";
        } else  {
            finalString = "Odd";
        }

        return finalString;
    }

    public static String even_or_odd_2 (int number){
        return (number%2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {

        System.out.println(even_or_odd( 5 ));
    }
}




