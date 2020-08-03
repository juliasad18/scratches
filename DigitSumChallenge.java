class DigitSumChallenge {

    //1. take the last number from the given numbers using % 10
    //2. create temporaryNumber which will contain numbers excepting the last number after the first iteration in while loop.
    //3. first iteration: result already contains last sign so it stays as it is;
    //                    temporaryNumber / 10 --> getting new temporaryNumber without last number
    //                    temporaryNumber % 10 --> getting last number of newly created temporaryNumber
    //                    result = result + last number of newly created temporaryNumber
    //4. going to the next iteration meanwhile temporaryNumber is greater then 0
    public static long sumDigits(long number) {
        long result = number % 10;
        long temporaryNumber = number;

        if (number >= 10) {
            while(temporaryNumber > 0) {
                temporaryNumber /= 10;  //temporaryNumber = temporaryNumber / 10
                result += temporaryNumber % 10; //result = result + temporaryNumber % 10

            }
            return result;
        } else {
            return result = -1;
        }
    }

    public static void main(String[] args) {

        System.out.println("Test No1:");
        long testResult1 = sumDigits(125);
        boolean isNumberSumCorrect1 = testResult1 == 8 ? true : false;
        if (isNumberSumCorrect1) {
            System.out.println("Sum is as expected: " + testResult1);
        } else {
            System.out.println("Sum is not as expected! Expected is 8, but actual: " + testResult1);
        }
        System.out.println(" ");
        System.out.println("Test No2:");
        long testResult2 = sumDigits(-125);
        boolean isNumberSumCorrect2 = testResult2 == -1 ? true : false;
        if (isNumberSumCorrect2) {
            System.out.println("The program is not working with negatives. Result is as expected: " + testResult2);
        } else {
            System.out.println("Result is not as expected! Expected is -1, but actual: " + testResult2);
        }
        System.out.println(" ");
        System.out.println("Test No3:");
        long testResult3 = sumDigits(32123);
        boolean isNumberSumCorrect3 = testResult3 == 11 ? true : false;
        if (isNumberSumCorrect3) {
            System.out.println("Sum is as expected: " + testResult3);
        } else {
            System.out.println("Sum is not as expected! Expected is 8, but actual: " + testResult3);
        }

    }
}