package OOPS.Advanced;

class Animal {
    public void special() {
        System.out.println("Generic method");
    }

    public static void move() {
        System.out.println("Generic Move");
    }
}

class AquaticAnimal extends Animal {
    @Override
    public void special() {
        System.out.println("Aquatic animal");
    }

    public static void move() {
        System.out.println("Aquatic Move");
    }
}

class ShallowVariable {

    public static void main(String[] args) {
        Animal a = new AquaticAnimal();
        a.special(); // execute methods in child only

        a.move(); // call the reference method which is parent class == Animal.move()
    }
}