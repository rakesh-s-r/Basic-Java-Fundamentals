package OOPS.Basic;

public class Main {
    public static void main(String[] args) {
        Car tata = new Car("Red", 10000);
        tata.drive();

        System.out.println("Car color is " + tata.color);
    }
}
