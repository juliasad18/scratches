class BalancedNumberAlgorithm {
    public static String balancedNum(long number) {
        Long longToString = new Long(number);
        String stringNumber = longToString.toString();
        int leftSum = 0;
        int rightSum = 0;
        String isBalanced = "Balanced";

        final String balanced = "Balanced";
        final String notBalanced = "Not Balanced";

        long numberCount = stringNumber.chars().count();
        if (numberCount > 2 && numberCount % 2 == 0) {
            Long firstWasteIndex = (numberCount / 2) - 1;
            Long lastWasteIndex = numberCount / 2;
            for (int i = 0; i < firstWasteIndex.intValue(); i++){
                int leftNumber = Character.getNumericValue(stringNumber.charAt(i));
                leftSum = leftSum + leftNumber;
            }
            for (int k = lastWasteIndex.intValue() + 1; k < stringNumber.length(); k++) {
                int rightNumber = Character.getNumericValue(stringNumber.charAt(k));
                rightSum = rightSum + rightNumber;
            }
            if (leftSum == rightSum) {
                isBalanced = balanced;
            } else {
                isBalanced = notBalanced;
            }
        } else if (numberCount > 2 && !(numberCount % 2 == 0)) {
            Long wasteMiddleNumber = (numberCount / 2);
            for (int i = 0; i < wasteMiddleNumber.intValue(); i++){
                int leftNumber = Character.getNumericValue(stringNumber.charAt(i));
                leftSum = leftSum + leftNumber;
            }
            for (int k = wasteMiddleNumber.intValue() + 1; k < stringNumber.length(); k++) {
                int rightNumber = Character.getNumericValue(stringNumber.charAt(k));
                rightSum = rightSum + rightNumber;
            }
            if (leftSum == rightSum) {
                isBalanced = balanced;
            } else {
                isBalanced = notBalanced;
            }

        } else {
            isBalanced = balanced;
        }
        return isBalanced;
    }


    public static void main(String[] args) {
        System.out.println(balancedNum(7));
        System.out.println(balancedNum(959));
        System.out.println(balancedNum(13));
        System.out.println(balancedNum(432));
        System.out.println(balancedNum(424));

        System.out.println(balancedNum(1024));
        System.out.println(balancedNum(66545));
        System.out.println(balancedNum(295591));
        System.out.println(balancedNum(1230987));
        System.out.println(balancedNum(56239814));


    }
}