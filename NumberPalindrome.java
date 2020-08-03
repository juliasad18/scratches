class NumberPalindrome {
    public static boolean isPalindrome (long number) {
        long reverseNumber = number % 10;
        long temporaryNumber = number;

        while (true) {
            temporaryNumber = temporaryNumber / 10;
            if (temporaryNumber == 0) {
                break;
            }
            reverseNumber = reverseNumber * 10 + temporaryNumber % 10;
        }

        if (number == reverseNumber) {
            return true;
        } else {
            return false;
        }
    }




    public static void main(String[] args) {
        System.out.println(isPalindrome(1203021));
        
    }
}