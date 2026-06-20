package OOPS.Advanced;

public class DemonThreads extends Thread {
    @Override
    public void run() {
        System.out.println("Executing demon threads " + Thread.currentThread().isDaemon());
    }

    public static void main(String[] args) throws InterruptedException {
        DemonThreads dt = new DemonThreads();
        dt.setDaemon(true);
        dt.start();
        Thread.sleep(100);
    }
}
