package OOPS.problemset.interviewset;

// Find the first and last occurrence of item in array
public class FirstLastOccurrence {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 4, 5, 1 };
        int b = 3;
        int first = -1, last = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        System.out.println("first and last is " + first + " " + last);
    }
}
