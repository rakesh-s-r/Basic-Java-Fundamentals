package OOPS;

class Parent {
    static void display() {
        System.out.println("Static method in Parent");
    }
}

class Child extends Parent {
    // This HIDES the Parent's static method; it does NOT override it.
    static void display() {
        System.out.println("Static method in Child");
    }
}

public class Workspace {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display(); // Prints "Static method in Parent" because obj is a Parent reference
    }
}