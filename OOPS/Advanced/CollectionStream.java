package OOPS.Advanced;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionStream {
    public static void main(String[] args) {
        // performConfigurationExample();
        performProcessingExample();
    }

    // configuration only 2 type: Map and Filter
    public static void performConfigurationExample() {
        List<Integer> list = new ArrayList<>(List.of(10, 20, 30, 5));

        // Create a new array where push all items greater than 10;
        List<Integer> a = new ArrayList<>();
        for (int i : list) {
            if (i >= 10) {
                a.add(i);
            }
        }
        System.out.println(a);
        // using streams
        List<Integer> a1 = list.stream().filter(x -> x >= 10).toList();
        System.out.println(a1);

        // Examples using forEach
        List<String> names = Arrays.asList("Reflection", "Collection", "Stream", "Structure");
        List<String> s_names = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        System.out.println(s_names);
        s_names.stream().forEach((s) -> System.out.println(s));

        // map
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4);
        list2.stream().map(i -> i * 2).forEach((i) -> System.out.println(i));
    }

    public static void performProcessingExample() {
        // collect all streams object
        List<String> names = Arrays.asList("Reflection", "Collection", "Stream", "Structure");
        List<String> s_names = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        System.out.println(s_names);

        // Foreach
        names.stream().map(s -> s.toLowerCase()).forEach(i -> System.out.println(i));

        // count
        System.out.println("\n" + names.stream().count() + "\n");

        // sorted
        names.stream().sorted().forEach(i -> System.out.println(i)); // Natural sorting comparable
        names.stream()
                .sorted((i1, i2) -> i2.compareTo(i1))
                .forEach(i -> System.out.println(i)); // custom ordering
                                                      // comparator

        // Min and max
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        System.out.println("\n" + list.stream().min((i, j) -> i.compareTo(j)).get());
        System.out.println(list.stream().max((i, j) -> i.compareTo(j)).get() + "\n");

        // toArray()
        System.out.println(Arrays.toString(list.stream().toArray())); // it always return generic Object[], u have to
                                                                      // convert int[] manually if u need

        // of method is used for not specific to collection
        String[] names_list = { "A", "B" };
        Stream.of(names_list).forEach(i -> System.out.println(i)); // convert primitive to streams first i.e of() used
        Stream.of(1, 11, 111).forEach(i -> System.out.println(i));
    }
}
