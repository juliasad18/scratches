
class RemoveFirstAndLastIndexFromString {
    public static String remove(String str) {
        int lastIndex = str.length() - 1;

        char[] charArray = new char[str.length() - 2];
        for (int i = 1; i < lastIndex; i++){
            char character = str.charAt(i);
            charArray[i - 1] = character;
        }

        String newString = String.valueOf(charArray);

        return newString;
    }

    public static String removeBetter(String str) {

        return str.substring(1, str.length() - 1);
    }


    public static void main(String[] args) {
        System.out.println(remove("country"));


    }
}