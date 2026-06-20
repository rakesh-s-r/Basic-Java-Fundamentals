package OOPS.Advanced;

import java.util.Optional;

public class OptionalMethod {
    public static void main(String[] args) {
        String name = "code";
        System.out.println(Optional.ofNullable(name == "code" ? "Code" : null).orElse("Default"));
        System.out.println(Optional.ofNullable(name == "code" ? "Code" : null).orElseGet(() -> "Default"));

        Optional<String> e = name == "Decode" ? Optional.of(name) : Optional.empty();
        if (e.isPresent()) {
            System.out.println("Value is correct");
        }

        e.ifPresent((n) -> System.out.println("Value is correct"));
        e.ifPresentOrElse((n) -> System.out.println("Value is correct"), () -> System.out.println("Value is invalid"));
    }
}
