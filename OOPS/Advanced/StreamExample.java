package OOPS.Advanced;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {
    int age;
    String name;

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public boolean equals(Object obj) {
        Employee other = (Employee) obj;
        return this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

}

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

        // GROUP, SET and Sort
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(30, "John"));
        employees.add(new Employee(32, "Michel"));
        employees.add(new Employee(30, "Britt"));
        employees.add(new Employee(30, "Britt"));

        Map<Integer, List<Employee>> emp_list = employees.stream().collect(Collectors.groupingBy(emp -> emp.getAge()));
        System.out.println(emp_list);

        Map<Integer, Set<Employee>> emp_set = employees.stream()
                .collect(Collectors.groupingBy(emp -> emp.getAge(),
                        TreeMap::new,
                        Collectors.toSet()));
        System.out.println(emp_set);

        // Calculation Problem
        System.out.println("--------------------------------------------------");
        // Fetch all ages;
        List<Integer> ages = employees.stream().map(emp -> emp.getAge()).sorted().collect(Collectors.toList());
        System.out.println(ages);
        System.out.println("Max ages is " + ages.stream().mapToInt(x -> x).summaryStatistics());

        // Return 2,3 ages
        List<Integer> slice_elem = ages.stream().skip(2).limit(2).collect(Collectors.toList());
        System.out.println(slice_elem);

        // Join - fetch all name, join with comma
        List<String> namList = employees.stream().map(x -> x.name.toUpperCase()).sorted().collect(Collectors.toList());
        System.out.println(namList.stream().collect(Collectors.joining(",")));

        // duplicates names problems
        System.out.println("--------------------------------------");
        List<String> nList = employees.stream().map(x -> x.name).collect(Collectors.toList());
        System.out.println(new HashSet<>(nList));
        HashSet<String> set = new HashSet<>();
        System.out.println(nList.stream().filter(x -> !set.add(x)).collect(Collectors.toList())); // it will list both
                                                                                                  // duplicate and
                                                                                                  // non-duplicate
        nList.stream().filter(x -> Collections.frequency(nList, x) > 1).collect(Collectors.toList());

        // sort employees with age by desc
        List<Employee> emp_l = employees.stream().sorted((x, y) -> y.getAge() - x.getAge())
                .collect(Collectors.toList());
        emp_l.forEach(x -> System.out.println(x.getAge()));
        // give results if its greater or equals to 3rd employee age
        List<Employee> emp_l2 = employees.stream().sorted((x, y) -> y.getAge() - x.getAge())
                .skip(2)
                .collect(Collectors.toList());
        emp_l2.forEach(x -> System.out.println("Item is " + x.getAge()));

        // Flat map
        System.out.println("--------------------------------------");
        List<List<String>> twoD = new ArrayList<>(Arrays.asList(List.of("Pune", "Banglore")));
        List<String> city_list = twoD.stream().flatMap(e -> e.stream()).collect(Collectors.toList());
        System.out.println(city_list);

        // Distinct
        System.out.println(Stream.of(1, 1, 2, 3, 3, 4, 5, 4).peek(i -> System.out.println("Original: " + i)).distinct()
                .collect(Collectors.toList()));

        // Reduce
        Optional<Integer> red = Arrays.asList(1, 2, 3).stream().reduce((x, y) -> x * y);
        System.out.println("Reduce operation is " + red);

        // allMatch == every in js
        System.out.println("All match " + Arrays.asList(1, 2, 3).stream().allMatch(i -> i > 0));

        // anyMatch == some in js
        System.out.println("Any match " + Arrays.asList(0, 2, 3).stream().anyMatch(i -> i > 0));

        // anyMatch == !allMatch
        System.out.println("None match " + Arrays.asList(-1, -2, -3).stream().noneMatch(i -> i > 0));
    }
}
