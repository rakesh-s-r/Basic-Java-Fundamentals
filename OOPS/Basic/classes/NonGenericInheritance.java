package OOPS.Basic.classes;

import java.util.*;

public class NonGenericInheritance extends Generic<List<Integer>> {
    public static void main(String[] args) {
        NonGenericInheritance obj = new NonGenericInheritance();
        obj.setValue(Arrays.asList(1, 2, 3));
        System.out.println("\nInheritance non generic class " + obj.getValue());
    }
}
