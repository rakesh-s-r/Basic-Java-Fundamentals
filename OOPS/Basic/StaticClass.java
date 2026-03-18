package OOPS.Basic;

class StaticExample {
    static String color = "Red";

    public void log() {
        System.out.println("Printing logs...");
    }
}

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

        // Static is belongs to the class
        StaticExample ste = new StaticExample();
        ste.log(); // it will give result but not recommended

        System.out.println("Color of the class " + StaticExample.color);
    }
}
