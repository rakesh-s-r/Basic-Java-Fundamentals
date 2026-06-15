package OOPS.Basic;

public class TypeCast {
    public static void main(String[] args) {
        char var = 97; // Implicit type of conversion, no data loss
        System.out.println("character value is " + var);

        int a = 129;
        byte byteA = (byte) a; // Explicit type conversion, data loss
        System.out.println("After conversion byte is " + byteA);
    }
}
