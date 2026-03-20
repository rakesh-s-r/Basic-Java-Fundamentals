package OOPS.Basic.classes;

interface Displayable {
    void display();
}

class Base {
    void baseMethod() {
        System.out.println("Base class method");
    }
}

// T must extend Base and implement Displayable
class MultiBounded<T extends Base & Displayable> {
    T obj;

    MultiBounded(T obj) {
        this.obj = obj;
    }

    void show() {
        obj.baseMethod(); // from Base
        obj.display(); // from Displayable
    }
}

// A concrete class that satisfies both
class Concrete extends Base implements Displayable {
    public void display() {
        System.out.println("Displaying Concrete object");
    }
}

public class MultiBoundGen<T extends Number & Comparable<T>> {
    T value;

    MultiBoundGen(T value) {
        this.value = value;
    }

    boolean isGreaterThan(T other) {
        return value.compareTo(other) > 0;
    }

    public static void main(String[] args) {
        MultiBoundGen<Integer> num = new MultiBoundGen<>(10);
        System.out.println(num.isGreaterThan(5)); // true

        MultiBoundGen<Double> num2 = new MultiBoundGen<>(7.5);
        System.out.println(num2.isGreaterThan(10.0)); // false

        MultiBounded<Concrete> mb = new MultiBounded<>(new Concrete());
        mb.show();
    }
}
