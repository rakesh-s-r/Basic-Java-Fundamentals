package OOPS.Advanced.Collections;

import java.util.*;

public class ArraysList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(40);
        list.add(30);
        list.add(3);

        System.out.printf("length is %d \n", list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(1));
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.addAll(list));

        System.out.println("Collections max: " + Collections.max(list));
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println("Collections reverse: " + list);

        Iterator<Integer> valueIterator = list.iterator();
        while (valueIterator.hasNext()) {
            int val = valueIterator.next();
            if (val == 3) {
                valueIterator.remove();
            }
            System.out.println(val);
        }
        System.out.println(list);

        list.forEach((Integer i) -> System.out.println(i));
        list.clear();
        System.out.println(list);
    }
}
