// Given N and sum,
// Find all N-digit numbers with sum of the digits equal to sum. N varies from [1,9] and sum <= 81 (Maximum possible sum in a 9-digit number)
public class SumOfDigits {
    public static void find(String res, int n, int sum) {
        // if number is less than N-digit and its sum of digits is
        // less than the given sum
        if (n > 0 && sum >= 0) {
            char d = '0';
            if (res.equals("")) { // special case - number can't start from 0
                d = '1';
            }

            // consider every valid digit and put it in the current index
            // and recur for next index
            while (d <= '9') {
                find(res + d, n - 1, sum - (d - '0'));
                d++;
            }
        }

        // if number becomes N-digit and its sum of digits is
        // equal to given sum, print it
        else if (n == 0 && sum == 0) {
            System.out.println(res + " ");
        }
    }

    public static void main(String[] args) {
        int N = 4;
        int sum = 25;
        String res = "";
        find(res, N, sum);
    }
}