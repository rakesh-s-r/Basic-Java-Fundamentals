package OOPS.Basic;

class AObject {
    void print() {
        System.out.println("A object is triggered");
    }
}

class BObject {
    void print() {
        System.out.println("B object is triggered");
    }
}

public class ObjectClass {
    public static void main(String[] args) {
        Object a = new AObject();
        Object b = new BObject();

        System.out.println(a.getClass());
        System.out.println(b.getClass());
    }
}
