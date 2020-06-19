import java.util.Scanner;

//Generate all permutations of a string 
//Recursive
public class Permutations {

    private static void swap(char[] c, int i, int j) {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }

    public static void perm(char[] c, int currentIndex) {
        if (currentIndex == c.length - 1) {
            System.out.println(String.valueOf(c));
        }
        for (int i = currentIndex; i < c.length; i++) {
            swap(c, currentIndex, i);
            perm(c, currentIndex + 1);
            System.out.println("value of char after recursion:" + currentIndex);
            swap(c, currentIndex, i);
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char[] c = str.toCharArray();
        perm(c, 0);

    }
}