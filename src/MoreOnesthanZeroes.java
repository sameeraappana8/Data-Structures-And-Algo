// given a positive integer N, find all N-digit binary numbers having more 1's than 0's for any prefix
public class MoreOnesthanZeroes {
    public static void AllCombinations(int n, String output, int ones, int zeroes) {
        // continue only if ones are greater than zeroes because we need binary numbers
        // having more 1s than 0s
        if (zeroes > ones) {
            return;
        }
        // base case: if n is exhausted then print output
        if (n == 0) {
            System.out.println(output);
            return;
        }

        // recur over the function to add all ones
        AllCombinations(n - 1, output + "1", ones + 1, zeroes);

        // recur over the function to add zeroes
        AllCombinations(n - 1, output + "0", ones, zeroes + 1);

    }

    public static void main(String[] args) {
        int n = 4;
        AllCombinations(n, "", 0, 0);
    }

}