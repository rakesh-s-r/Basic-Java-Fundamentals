package OOPS.Basic.classes;

public class GenericInheritance<T> extends Generic<T> {
    public static void main(String[] args) {
        GenericInheritance<Character> obj = new GenericInheritance<>();
        obj.setValue('a');
        System.out.println(obj.getValue());
    }
}
