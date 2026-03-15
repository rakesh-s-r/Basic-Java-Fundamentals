package OOPS.Basic;

public class Car {
    String color;
    int price;

    public Car(String color, int price) {
        this.color = color;
        this.price = price;
    }

    public void drive() {
        System.out.println("Car is Driving and color of car is " + color);
    }
}
