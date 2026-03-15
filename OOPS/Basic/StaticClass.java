package OOPS.Basic;

class Static {
    static void start() {
        System.out.println("Start");
    }
}

public class StaticClass {
    public static void main(String[] args) {
        // Without creating an object we can directly call class method, thats how JVM
        // calls main method outside of class
        Static.start();
    }
}
