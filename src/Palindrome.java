//Given a string print whether the string is palindrome or not
public class Palindrome {
    private static void swap(char[] c, int l, int r) {
        char temp = c[l];
        c[l] = c[r];
        c[r] = temp;
    }

    public static void IsPalindrome(char[] c, int l, int r) {
        if (l < r) {
            swap(c, l, r);
            IsPalindrome(c, l + 1, r - 1);
        }

    }

    public static void main(String[] args) {
        String str = "madame";
        char[] c = str.toCharArray();
        IsPalindrome(c, 0, c.length - 1);
        String str1 = new String(c);
        if (str.equals(str1)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}