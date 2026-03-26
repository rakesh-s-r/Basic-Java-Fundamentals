package OOPS.Advanced;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.putIfAbsent(2, 2);
        System.out.println("Size of the map is " + map.size());

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey());
        }

        for (Integer entry : map.keySet()) {
            System.out.println(entry);
        }

        for (Integer entry : map.values()) {
            System.out.println(entry);
        }
    }
}
