package OOPS.Basic.pillars;

// even though if we did not specify abstract in-front 
// of method it will be added by default just like public
abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();

    void sleep() {
        System.out.println(name + " is sleeping");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Cat is making sound....");
    }

    void catCustomMethod() {
        System.out.println("This is method used only in cat class");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        // Animal cat = new Animal(); ERROR: cannot create a object of abstract class

        Animal cat = new Cat("Robbie");
        cat.makeSound();
        cat.sleep();
        // cat.catCustomMethod();
    }
}