import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class InterleavingStrings {
    public static void  interLeavings(String curr, String X, String Y, Set<String> result){
        //insert curr into set if we have reached end of both strings
        if(X.length() == 0 && Y.length() == 0){
            result.add(curr);
            return;
        }

        //if string X is not empty, append its first cahracter in the
        //result and recur for remaining substring
        if(X.length()>0){
            interLeavings(curr+X.charAt(0),X.substring(1),Y,result);
        }

        //if string Y is not empty, append its first character in the
        //result and recur for remaining substring
        if(Y.length()>0){
            interLeavings(curr+Y.charAt(0),X,Y.substring(1),result);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String X = s.nextLine();
        String Y = s.nextLine();
        //using set to handle duplicates
        Set<String> result = new HashSet<>();
        interLeavings("",X,Y,result);
        System.out.println(result);

    }
}
