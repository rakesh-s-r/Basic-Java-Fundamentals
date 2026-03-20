package OOPS.Basic.classes;

/*
 Enum is a collection of constants(which are static and final)
 It cannot extend any classes
 It cannot be initiated 
 No other class can be extended
*/
public class Enum {

    // const collections
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    // Enum has variable, constructor and methods
    // constructor is always a private cannot initiated
    enum Level {
        LOW(1), MEDIUM(2), HIGHT(3);

        private int val;

        Level(int val) {
            this.val = val;
        }

        public int getValue() {
            return this.val;
        }
    }

    // enum with methods
    enum Operation {
        ADD {
            int apply(int a, int b) {
                return a + b;
            };
        },
        SUBTRACT {
            int apply(int a, int b) {
                return a - b;
            };
        };

        abstract int apply(int a, int b);
    }

    public static void main(String[] args) {
        Day today = Day.MONDAY;
        System.out.println(today);

        System.out.println(Level.HIGHT.getValue());

        System.out.println(Operation.ADD.apply(10, 0));

        System.out.println(Day.valueOf("MONDAY").name());
    }
}
