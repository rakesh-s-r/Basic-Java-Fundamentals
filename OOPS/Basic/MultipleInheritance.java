package OOPS.Basic;

interface MammalsI {
    void sleep();
}

interface ElephantMammals {
    void swim();
}

class ElephantI implements MammalsI, ElephantMammals {
    public void sleep() {
        System.out.println("Elephant is sleeping");
    }

    public void swim() {
        System.out.println("Elephant is Swimming");
    }
}

public class MultipleInheritance {
    // Multiple inheritance wont support but we can achieve using interface
    public static void main(String[] args) {
        ElephantI elephantI = new ElephantI();
        elephantI.sleep();
        elephantI.swim();
    }
}
