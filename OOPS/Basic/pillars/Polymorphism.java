package OOPS.Basic.pillars;

class Addition {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

class A {
    void start() {
        System.out.println("class A is running");
    }
}

class B extends A {
    void start() {
        System.out.println("class B is running");
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        // Method overloading / Compile Time / Static Polymorphism
        Addition addition = new Addition();
        System.out.println(addition.add(1, 2));
        System.out.println(addition.add(1, 2, 3));

        // Method Overriding / Runtime / Dynamic Polymorphism
        A classA = new B();
        classA.start();
    }
}
