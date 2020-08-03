import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class FindMissingLetter {

    public static char[] returnRightSequence (char[] givenArray) {
        int startIndex = 0;
        int endIndex = 0;

        String firstLetter = Array.get(givenArray, 0).toString().toLowerCase();
        String lastLetter = Array.get(givenArray, givenArray.length - 1).toString().toLowerCase();

        char[] alphabet = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        List<String> newList = new ArrayList<>();


        for (int i = 0; i < alphabet.length; i++) {
            if (Array.get(alphabet, i).toString().equals(firstLetter)) {
                startIndex = i;
            } else if (Array.get(alphabet, i).toString().equals(lastLetter)) {
                endIndex = i;
                break;
            }
        }

        for (int i = 0; i < alphabet.length; i++) {
            if (i >= startIndex && i <= endIndex) {
                newList.add(Array.get(alphabet, i).toString());
            } else if (i > endIndex) {
                break;
            }
        }

        char[] finalString = newList.stream().collect(Collectors.joining()).toCharArray(); //zdesj Collect snachala sobirajet v String, a potom String peredelivajet v char[]
        return finalString;
    }

    public static char findMissingLetter(char[] array) {
        String character = "";
        char finalCharacter;
        boolean isUppercase = false;

        char[] exampleList = returnRightSequence(array);

        if (Character.isUpperCase(array[0])) {
            for (int i = 0; i < array.length; i++) {
                array[i] = Array.get(array, i).toString().toLowerCase().charAt(0);
            }
            isUppercase = true;
        }

        for (int i = 0; i < exampleList.length; i++) {
            if (!Array.get(exampleList, i).equals(Array.get(array, i))) {
                character = Array.get(exampleList, i).toString();
                break;
            }
        }

        if (isUppercase) {
            finalCharacter = character.toUpperCase().charAt(0);
        } else {
            finalCharacter = character.charAt(0);
        }
        return finalCharacter;
    }

    //BEST SIMPLE EASY - characters also go in sequence like numbers - i++
    public static char findMissingLetter2(char[] array){
        char expectableLetter = array[0];
        for(char letter : array){
            if(letter != expectableLetter) break;
            expectableLetter++;
        }
        return expectableLetter;
    }



    public static void main(String[] args) {

        System.out.println(findMissingLetter2(new char[] { 'a','b','c','d','f' }));
        System.out.println(findMissingLetter2(new char[] { 'O','Q','R','S' }));
    }
}




