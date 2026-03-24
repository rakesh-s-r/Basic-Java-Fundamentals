package OOPS.Advanced;

public class SwitchExpression {
    public static void main(String[] args) {
        int val = 1;
        String outputVal = switch (val) {
            case 1 -> "One";
            case 2 -> "Two";
            default -> "None";
        };
        System.out.println(outputVal);

        String outVal = switch (val) {
            case 1 -> {
                // some logic
                yield "One";
            }
            case 2 -> {
                yield "Two";
            }
            default -> {
                yield "None";
            }
        };
        System.out.println(outVal);
    }
}
