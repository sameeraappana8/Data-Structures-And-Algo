public class PermutationsWithoutChar {
    public static void perm(String candidate, String remaining) {
        if (remaining.length() == 0) {
            System.out.println(candidate);
        }
        for (int i = 0; i < remaining.length(); i++) {
            String newCandidate = candidate + remaining.charAt(i);
            System.out.println("newCandidate:" + newCandidate);
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
            System.out.println("newRemaining:" + newRemaining);
            perm(newCandidate, newRemaining);
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        perm("", s);
    }

}