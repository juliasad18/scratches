import java.util.*;

class ExcludeWordCouplesInSequence {

    public static String wordToBeExcluded (String word) {
        //better to rewrite with HashMap!!!
        String wordToExclude = "";
        if (word.toUpperCase().equals("NORTH")) {
            wordToExclude = "SOUTH";
        } else if (word.toUpperCase().equals("SOUTH")) {
            wordToExclude = "NORTH";
        } else if (word.toUpperCase().equals("EAST")) {
            wordToExclude = "WEST";
        } else if (word.toUpperCase().equals("WEST")) {
            wordToExclude = "EAST";
        }
        return wordToExclude;
    }

    public static String[] dirReduc (String[] arr)  {
        List<String> givenList = Arrays.asList(arr);
        List<String> finalList = new ArrayList<>();

        for (String i : givenList) {
            String wordToExcludeUppercase = wordToBeExcluded(i);

            int lastIndex = finalList.size() - 1; //if it is empty, result is -1
            if (!(lastIndex == -1)) {
                String previousWord = finalList.get(lastIndex);
                if (previousWord.toUpperCase().equals(wordToExcludeUppercase)) {
                    finalList.remove(lastIndex);
                } else {
                    finalList.add(i);
                }
            } else {
                finalList.add(i);
            }

        }

        String[] finalArray = new String[finalList.size()];
        finalArray = finalList.toArray(finalArray);
        return finalArray;
    }

    //working only with UpperCase
    public static Stack<String> dirReduc2(String[] arr) {
        final Stack<String> stack = new Stack<>();

        for (final String direction : arr) {
            final String lastElement = stack.size() > 0 ? stack.lastElement() : null;

            switch(direction) {
                case "NORTH": if ("SOUTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "SOUTH": if ("NORTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "EAST":  if ("WEST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "WEST":  if ("EAST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
            }
        }
        return stack; //.stream().toArray(String[]::new);
    }




    public static void main(String[] args) {

        System.out.println(dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));
        System.out.println(dirReduc(new String[]{"North", "South", "SoUth", "East", "West", "North", "West"}));
        System.out.println(dirReduc(new String[]{"NORTH", "WEST", "SOUTH", "EAST"}));
        //System.out.println(indexIfPairExists(Arrays.asList(new String[]{"South", "South", "East", "West", "North", "West"}), "NORTH"));
        //System.out.println(wordToBeExcluded("South"));
    }
}




