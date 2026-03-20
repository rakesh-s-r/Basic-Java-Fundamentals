package OOPS.Basic;

public class Argument {

    void evaluateArgs(int a, int... variable) {
        System.out.println("A is " + a);
        for (int var : variable) {
            System.out.println(var);
        }
    }

    public static void main(String[] arg) {
        Argument args = new Argument();
        args.evaluateArgs(1, 2, 3, 4);
    }
}
