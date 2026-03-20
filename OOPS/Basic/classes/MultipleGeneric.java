package OOPS.Basic.classes;

import java.util.HashMap;

public class MultipleGeneric<K, V> {
    K key;
    V value;
    HashMap<K, V> map = new HashMap<>();

    void setKey(K key, V value) {
        map.put(key, value);
    }

    V getKey(K key) {
        return map.get(key);
    }

    public void printValue(K key, V value) {
        System.out.println("Before " + map.get(key));
        map.put(key, value);
        System.out.println("After " + map.get(key));
    }

    public static void main(String[] args) {
        MultipleGeneric<Character, Integer> map = new MultipleGeneric<>();
        map.setKey('A', 67);
        map.setKey('b', 93);
        System.out.println(map.getKey('A'));
        System.out.println(map.getKey('b'));
        map.printValue('b', 23);
    }
}
