

class GetMiddleCharacters {
    public static String getMiddle(String word){
        String finalString = "";
        int numberOfLetters = word.length();
        int middle = numberOfLetters / 2;

        if (numberOfLetters % 2 == 0) {
            finalString = word.substring(middle - 1, middle + 1);
        } else {
            finalString = word.substring(middle, middle + 1);
        }


        return finalString;
    }


    public static void main(String[] args) {

        System.out.println(getMiddle( "A" ));
    }
}




