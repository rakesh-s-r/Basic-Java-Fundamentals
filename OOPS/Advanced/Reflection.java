package OOPS.Advanced;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@SuppressWarnings("unused") // Ignore warning
class Test {
    int val = 0;

    public void sayHello() {
        System.out.println("Hello!");
    }

    private void sayEat() {
        System.out.println("Eat!");
    }
}

public class Reflection {
    public static void main(String[] args) throws Exception {
        // Class<?> cls = Class.forName("Test");
        Class<?> cls = Test.class;
        Object obj = cls.getDeclaredConstructor().newInstance();
        Method method = cls.getMethod("sayHello");
        method.invoke(obj);

        /*
         * getDeclaredMethods return all custom methods
         * getMethods return all class and custom public methods
         * getFields return only public fields
         */
        for (Method mtd : cls.getDeclaredMethods()) {
            System.out.println("Method name: " + mtd.getName());
            System.out.println("Return type: " + mtd.getReturnType() + "\n");
        }

        /*
         * set field value
         * we can set private value as well by making public using reflection
         */
        Test test = new Test();
        Field field = cls.getDeclaredField("val");
        field.set(test, 100);
        System.out.println(test.val);
    }
}
