package OOPS.Basic;

/*
Interface can be used as a data type
It cannot be create as a object
we can achieve abstraction
we can achieve multiple inheritance
 */
interface InnerInterface {
    void fly();

    void read();

    void display();

    public interface Smile {
        void smile();
    }
}

class ClassAbs implements InnerInterface.Smile {
    public void smile() {
        System.out.println("Smile System is fly");
    }
}

public class Interface implements InnerInterface {

    @Override
    public void fly() {
        System.out.println("System is fly");
    }

    @Override
    public void read() {
        System.out.println("System is read");
    }

    @Override
    public void display() {
        System.out.println("System is display");
    }

    public static void main(String[] args) {
        Interface in = new Interface();
        in.display();

        InnerInterface.Smile abs = new ClassAbs();
        abs.smile();
    }
}
