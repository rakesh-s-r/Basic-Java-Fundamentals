package OOPS.Basic.classes;

public class Generic<T> {
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T val) {
        this.value = val;
    }

    public static void main(String[] args) {
        Generic<Integer> obj = new Generic<>();
        obj.setValue(10);
        System.out.println("\ngeneric class value is " + obj.getValue() + "\n");

        Generic<String> obj1 = new Generic<>();
        obj1.setValue("Name");
        System.out.println("generic class value is " + obj1.getValue() + "\n");
    }
}
