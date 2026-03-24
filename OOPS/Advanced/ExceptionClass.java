package OOPS.Advanced;

public class ExceptionClass {
    public static void main(String[] args) {
        try {
            int a = -10;
            System.out.println(-a);
            arithmeticException();
        } catch (Exception e) {
            System.err.println("Exception while executing " + e);
        }
    }

    public static void arithmeticException() throws ArithmeticException {
        throw new ArithmeticException();
    }
}
