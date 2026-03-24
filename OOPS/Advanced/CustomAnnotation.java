package OOPS.Advanced;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME) // retention will decide at what time to execute like runtime
@interface MyCustomAnnotation {
    String name() default "default name";
}

@MyCustomAnnotation(name = "first annotation")
public class CustomAnnotation {
    public static void main(String[] args) {
        System.out.println("\n" + new CustomAnnotation().getClass().getAnnotation(MyCustomAnnotation.class));
    }
}
