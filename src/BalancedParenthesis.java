public class BalancedParenthesis {
    public static void balParenthesis(String output, int input, int open) {
        // if n is odd then we can't form balanced parenthesis.
        if (input % 2 != 0 && open == 0) {
            System.out.println("No can do brother!");
            return;
        }

        // base case: length of n is reached
        if (input == 0) {

            // if open brackets all are also used
            if (open == 0) {
                System.out.println(output);
            }
            return;
        }
        // Optimization: return if we cannot close all open brackets with remaining
        // input parenthesis
        if (open > input) {
            return;
        }
        // recur with open parenthesis
        balParenthesis(output + "(", input - 1, open + 1);

        // recur with closed parentheses only if string has atleast one unclosed
        // parentheses
        if (open > 0) {
            balParenthesis(output + ")", input - 1, open - 1);
        }
    }

    public static void main(String[] args) {
        int n = 6;
        balParenthesis("", n, 0);
    }
}