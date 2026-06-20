package OOPS.Advanced;

public class GarbageCollector {
    public static void main(String[] args) {
        GarbageCollector Gc = new GarbageCollector();
        Gc = null;

        // System.gc();
        Runtime.getRuntime().gc();
        System.out.println("Method execution is done");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method is called"); // we know finalize method call before GC
    }
}
