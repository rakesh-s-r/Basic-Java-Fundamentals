package OOPS.Basic;

public class Strings {
    public static void main(String[] args) {
        // why == not work for 2 string refer bellow
        String a = "Java";
        String b = "Java";
        System.out.println(a == b); // both a, b refers to same string pool

        String c = new String("Java");// it will create ref in heap not pool
        String d = c.intern();
        System.out.println(a == c);
        System.out.println(a.equals(c));
        System.out.println(a == d);

        // Different case
        String x = "Java" + "8";
        String y = "Java" + "8";
        System.out.println(x == y);
        String ver = "8";
        String z = "Java" + ver;
        System.out.println(x == z);
    }
}
