package OOPS.Basic;

class Mammals {
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Elephant extends Mammals {
    void eat() {
        System.out.println("Elephant is eating");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        elephant.eat();
        elephant.sleep();
    }
}
