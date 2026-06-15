package OOPS.problemset.interviewset;

import java.util.Scanner;

// toggle a string from StRing -> sTrING
public class Toggle {
    public static void main(String[] args) {
        Scanner scannerIn = new Scanner(System.in);
        System.out.println("Enter you're a string");
        String str = scannerIn.nextLine();
        System.out.println("Entered string is " + str);
        StringBuilder s = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                s.append(Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch)) {
                s.append(Character.toLowerCase(ch));
            } else {
                s.append(ch);
            }
        }
        System.out.println("After toggle string is " + s);
    }
}
