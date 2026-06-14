package OOPS.Basic.classes.Static;

public class Demo {

    private int a = 10;
    private static int b = 10;

    public static void main(String[] args) {
        Demo dem = new Demo();
        dem.invoke();
    }

    public void invoke() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(this);
        invokeStatic();
    }

    public static void invokeStatic() {
        System.out.println("I am inside static class");
        // System.out.println(a); // compile error
        System.out.println(b);
        // System.out.println(this); // compile error
    }
}