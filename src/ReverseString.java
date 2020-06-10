import java.util.Scanner;

public class ReverseString {
    private static void swap(char[] c, int l, int r){
        char temp = c[l];
        c[l]=c[r];
        c[r]=temp;
    }
    public static void reverse(char[] c, int l, int r){
        if(l<r){
            swap(c,l,r);
            reverse(c,l+1,r-1);
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char[] c = str.toCharArray();
        reverse(c,0,c.length-1);
        str = new String(c);
        System.out.println("The reversed string is:" + str);

    }

}
