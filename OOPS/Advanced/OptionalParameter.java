package OOPS.Advanced;

import java.util.Arrays;

public class OptionalParameter<T> {
    public static void main(String[] args) {
        evaluate(0, 1, 2, "hello");
    }

    public static <T> void evaluate(@SuppressWarnings("unchecked") T... a) {
        System.out.println(Arrays.toString(a));
    }
}
