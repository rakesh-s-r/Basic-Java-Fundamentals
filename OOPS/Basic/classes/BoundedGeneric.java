package OOPS.Basic.classes;

// Bounded generic like below class only support numbers;
public class BoundedGeneric<T extends Number> {
    T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        BoundedGeneric<Integer> obj = new BoundedGeneric<>();
        obj.setValue(10);
        System.out.println(obj.getValue());

        // BoundedGeneric<String> obj2 = new BoundedGeneric<>();
        // obj2.setValue("Shark");
        // System.out.println(obj2.getValue());
    }
}
