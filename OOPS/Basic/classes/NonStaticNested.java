package OOPS.Basic.classes;

public class NonStaticNested {
    class Inner {
        public void run() {
            System.out.println("Executing non static nested class");
        }
    }

    public static void main(String[] args) {
        NonStaticNested obj = new NonStaticNested();
        NonStaticNested.Inner obj2 = obj.new Inner();
        obj2.run();
    }
}
