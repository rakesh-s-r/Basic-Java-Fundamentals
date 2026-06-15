package OOPS.problemset.interviewset;

import java.util.Arrays;

// Reverse array without using extra space and use recursion
public class ReverseArray {

    public static void reverseArray(int[] a, int start, int end) {
        if (start >= end) {
            return;
        }

        // swap elements
        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;
        reverseArray(a, start + 1, end - 1); // the increments happen only in the current stack frame,
        // but the recursive call gets the old values
    }

    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 4 };
        reverseArray(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
