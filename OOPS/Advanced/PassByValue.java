package OOPS.Advanced;

public class PassByValue {
    int a = 10;

    public static void main(String[] args) {
        int a = 10;
        change(a); // Pass by value bcz primitive send the copy of value
        System.out.println(a);

        PassByValue p = new PassByValue();
        change(p);// pass by reference
        System.out.println(p.a);
    }

    public static void change(int a) {
        a = 100;
    }

    public static void change(PassByValue p) {
        p.a = 100;
    }
}
