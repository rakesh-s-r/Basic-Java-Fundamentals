package OOPS.Basic.classes;

// Local inner class cannot be created using public, private and protected class
// It cannot be initiated outside of class
public class LocalInner {
    void display() {
        int num = 10;

        class LocalInnerClass {
            void print() {
                System.out.println("Local inner class in executing with num " + num);
            }
        }

        LocalInnerClass obj = new LocalInnerClass();
        obj.print();
    }

    public static void main(String[] args) {
        LocalInner obj = new LocalInner();
        obj.display();
    }
}
