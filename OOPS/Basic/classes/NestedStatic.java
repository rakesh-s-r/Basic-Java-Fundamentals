package OOPS.Basic.classes;

public class NestedStatic {
    class Inner {
        public static void run() {
            System.out.println("Executing nested inner static class");
        }
    }

    public static void main(String[] args) {
        NestedStatic.Inner.run();
    }
}
