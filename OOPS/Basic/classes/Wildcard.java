package OOPS.Basic.classes;

import java.util.*;

public class Wildcard {
    void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        Wildcard wd = new Wildcard();
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<String> list2 = Arrays.asList("of", "and", "or");
        wd.printList(list1);
        wd.printList(list2);
    }
}
