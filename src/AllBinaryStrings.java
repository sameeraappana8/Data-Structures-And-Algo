//Given a binary pattern that contains '?' wildcard cahracter at few positions, find all possible combinations of binary strings that can be formed by replacing the wildcard character by either 0 or 1.

import java.util.Scanner;

public class AllBinaryStrings {
    private static void printAllCombinations(char[] pattern, int i){
        if(i == pattern.length){
            System.out.println(pattern);
            return;
        }
        //if current character is '?'
        if(pattern[i] == '?'){
            for(char c ='0';c<='1';c++){
                //replace '?' with 0 and then with 1
                pattern[i] = c;

                //recur for the remaining pattern
                printAllCombinations(pattern, i+1);

                //backtrack as array is passed by reference to the function
                pattern[i] = '?';
            }
            return;

        }
        //if the current character is 0 or 1, ignore it and
        //recur for the remaining pattern
        printAllCombinations(pattern,i+1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] pattern = s.nextLine().toCharArray();
        printAllCombinations(pattern, 0);
    }
}
