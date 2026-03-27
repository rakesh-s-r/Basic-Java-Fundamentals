package OOPS.Advanced;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        long res = list.stream().filter((Integer item) -> item >= 30).count();
        System.out.println(res);

        // Filter
        Stream<Integer> stream = Stream.of(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
        Stream<Integer> res1 = stream.filter((Integer item) -> item >= 30);
        List<Integer> list1 = res1.collect(Collectors.toList());
        System.out.println(list1);

        Stream<Integer> stream1 = Stream.of(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
        Stream<Integer> res2 = stream1.map((Integer item) -> item * 2);
        List<Integer> list2 = res2.collect(Collectors.toList());
        System.out.println(list2);

        List<List<String>> list3 = new ArrayList<>();
        list3.add(Arrays.asList("A", "B", "C"));
        list3.add(Arrays.asList("D", "E", "F"));
        Stream<List<String>> stream2 = list3.stream();
        Stream<String> res3 = stream2.flatMap((List<String> item) -> item.stream());
        List<String> list4 = res3.collect(Collectors.toList());
        System.out.println(list4);

        List<List<String>> list5 = new ArrayList<>();
        list5.add(Arrays.asList("A", "B", "C"));
        list5.add(Arrays.asList("D", "E", "F"));
        Stream<List<String>> stream4 = list5.stream();
        Stream<String> res4 = stream4
                .flatMap((List<String> item) -> item.stream().map((String val) -> val.toLowerCase()));
        System.out.println(res4.collect(Collectors.toList()));

        Integer[] a = { 1, 2, 2, 3, 3, 4, 5, 6, 5, 6, 7, 8 };
        Stream<Integer> s = Arrays.stream(a).distinct();
        System.out.println(s.collect(Collectors.toList()));
    }
}
