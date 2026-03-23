package OOPS.Basic.classes;

@FunctionalInterface
interface AnimalInterface {
    void makeSound(String val);
}

// Types of interface
@FunctionalInterface
interface Consumer<T> {
    void accept(T t);
}

@FunctionalInterface
interface Supplier<T> {
    T get();
}

@FunctionalInterface
interface Function<T, R> {
    R apply(T t);
}

@FunctionalInterface
interface Predicate<T> {
    boolean apply(T t);
}

public class LambdaExpressions {
    public static void main(String[] args) {
        // Its a anonymous class
        AnimalInterface pig = new AnimalInterface() {
            @Override
            public void makeSound(String val) {
                System.out.println("Hello there!");
            }
        };
        pig.makeSound("");

        // Achieve using lambda expression
        AnimalInterface animal = (String val) -> {
            System.out.println("Hello there from Lambda expression");
        };
        animal.makeSound("");
    }
}
