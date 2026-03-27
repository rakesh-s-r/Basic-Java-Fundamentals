package OOPS.Advanced.Threads;

public class MonitorLock {
    boolean itemAvailable = false;

    synchronized void addItem() {
        itemAvailable = true;
        System.out.println("Item added by " + Thread.currentThread().getName() + " and invoking");
        notifyAll();
    }

    synchronized void consumeItem() {
        System.out.println("Consume item method invoke by " + Thread.currentThread().getName());

        if (!itemAvailable) {
            try {
                System.out.println("Thread " + Thread.currentThread().getName());
                wait();
                System.out.println("Thread is completed");
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        System.out.println("Item is consumed by " + Thread.currentThread().getName());
        itemAvailable = false;
    }

    public static void main(String[] args) {
        MonitorLock obj = new MonitorLock();
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            obj.addItem();
        });
        Thread t2 = new Thread(() -> obj.consumeItem());

        t1.start();
        t2.start();
    }
}
