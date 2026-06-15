package OOPS.problemset.interviewset;

import java.util.Scanner;

// count 0 in 1000 -> 3
public class CountDigit {

    public static int countDigits(int n, int d) {
        int count = 0;
        while (n > 0) {
            if (n % 10 == d) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number N");
        int n = sc.nextInt();
        System.out.println("Enter digit to counts");
        int d = sc.nextInt();
        int count = countDigits(n, d);
        System.out.println("Digits " + d + " occurs " + count + "times in " + n);
    }
}
