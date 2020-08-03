import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Tickets_Clerk {

    public static String Tickets(int[] peopleInLine) {
        String finalResult = "";
        String yes = "YES";
        String no = "NO";
        int counter25 = 0;
        int counter50 = 0;
        HashMap<String, Integer> availableValues = new HashMap<>();
        availableValues.put("25", 0);
        availableValues.put("50", 0);

        HashMap<String, String> finalResultList = new HashMap<>();
        finalResultList.put("finalResult", yes);

        for (int value : peopleInLine) {
            if (String.valueOf(value).equals("25")) {
                availableValues.put("25", counter25=counter25+1);
            } else if (String.valueOf(value).equals("50")) {
                if (availableValues.get("25") > 0) {
                    availableValues.put("50", counter50=counter50+1);
                    availableValues.put("25", counter25=counter25-1);
                } else {
                    finalResultList.put("finalResult", no);
                    break;
                }
            } else if (String.valueOf(value).equals("100")) {
                if (availableValues.get("25") > 0 && availableValues.get("50") > 0) {
                    availableValues.put("50", counter50=counter50-1);
                    availableValues.put("25", counter25=counter25-1);
                } else if (availableValues.get("25") > 2) {
                    availableValues.put("25", counter25=counter25-3);
                } else {
                    finalResultList.put("finalResult", no);
                    break;
                }
            }
        }

        finalResult = finalResultList.get("finalResult");

        return finalResult;
    }



    public static void main(String[] args) {
        System.out.println(Tickets(new int[] {25, 25, 50, 100}));
    }
}




