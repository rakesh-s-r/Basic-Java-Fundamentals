package OOPS.Basic;

public class Boxing {
    public static void main(String[] args) {
        Integer a = 10; // Integer.valueOf(10);
        int b = a; // a.intValue();
        System.out.println(a);

        Integer val = null;
        int x = val; // Null pointer exception
        System.out.println(x);
    }
}
