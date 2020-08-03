

class SumOfMultiples {
    public static int solution(int number) {
        int finalResult = 0;

        for (int i = 0; i < number; i++) {
            if ( i % 3 == 0 || i % 5 == 0) {
                finalResult = finalResult + i;
            }
        }


        return finalResult;
    }


    public static void main(String[] args) {
        System.out.println(solution(20));

    }
}