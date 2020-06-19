import java.util.Arrays;
import java.util.List;
// Find all possible combinations of words formed from mobile keypad

public class KeypadCombinations {
    public static void findCombinations(List<List<Character>> keypad, int[] input, String res, int index){
        //if we have processed every digit of the key, print result
        if(index == -1){
            System.out.println(res+ " ");
            return;
        }

        //stores current digit
        int digit = input[index];

        //one by one replace the digit with each character in the corresponding
        //list and recur for the next digit

        for(char c:keypad.get(digit)){
            findCombinations(keypad, input, c+res,index-1);
        }
    }
    public static void main(String[] args) {
        List<List<Character>> keypad = Arrays.asList(
                // 0 and 1 don't have any characters associated
                Arrays.asList(),
                Arrays.asList(),
                Arrays.asList('A','B','C'),
                Arrays.asList('D','E','F'),
                Arrays.asList('G','H','I'),
                Arrays.asList('J','K','L'),
                Arrays.asList('M','N','O'),
                Arrays.asList('P','Q','R','S'),
                Arrays.asList('T','U','V'),
                Arrays.asList('W','X','Y','Z')

        );

        // INPUT NUMBER IN THE FORM OF AN ARRAY (NUMBER CANT START FROM 0 OR 1)
        int[] input = { 2,3,4 };

        //find all combinations
        findCombinations(keypad, input, "", input.length-1);
    }
}
