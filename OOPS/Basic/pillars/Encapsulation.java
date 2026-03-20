package OOPS.Basic.pillars;

class CarWithPrice {
    private double discount = 0.5;
    String model;
    double onRoundPrice;

    public CarWithPrice(String model, double onRoundPrice) {
        this.model = model;
        this.onRoundPrice = onRoundPrice;
    }

    public double getPrice() {
        return onRoundPrice * discount;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        CarWithPrice toyata = new CarWithPrice("latest", 1000);
        System.out.println("After discount " + toyata.getPrice());
        // System.out.println(toyata.discount);
    }
}
