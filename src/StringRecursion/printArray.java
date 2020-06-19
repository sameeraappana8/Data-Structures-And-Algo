//Print array elements using recursion
public class printArray {
    public static void printElements(int[] a, int index) {
        if (index != -1) {
            printElements(a, index - 1);
            System.out.println(a[index]);
        }

    }

    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 4 };
        printElements(a, a.length - 1);
    }

}