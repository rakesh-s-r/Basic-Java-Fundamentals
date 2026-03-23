package OOPS.Basic.classes;

import java.util.*;

/*
We cannot change the value of an object once it is created.
Declare a class with final
cannot be extended
all constructor methods are private
just getters method
Example: String, Wrapper classes 
 */

final class Immutable {
    private final String name;
    private final List<String> petList;

    private Immutable(String name, List<String> petList) {
        this.name = name;
        this.petList = petList;
    }

    String getName() {
        return name;
    }

    List<String> getList() {
        return new ArrayList<>(petList);
    }

    public static void main(String[] args) {
        Immutable imt = new Immutable("John", new ArrayList<>(Arrays.asList("dog", "cats")));
        System.out.println(imt.getName());
        imt.getList().add("cows");
        System.out.println(imt.getList());
    }
}
