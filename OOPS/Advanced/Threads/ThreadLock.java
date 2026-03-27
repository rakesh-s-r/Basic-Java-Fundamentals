package OOPS.Advanced.Threads;

public class ThreadLock {

    public synchronized void task1() {
        try {
            System.out.println("Task 1 is executing");
            Thread.sleep(1000);
            System.out.println("Task 1 is completed");
        } catch (InterruptedException e) {
        }
    }

    public void task2() {
        System.out.println("Task 2 is executing");
        synchronized (this) {
            System.out.println("Task 2 is completed");
        }
    }

    public void task3() {
        System.out.println("Task 3 is completed");
    }

    public static void main(String[] args) {
        ThreadLock obj = new ThreadLock();
        Thread t1 = new Thread(() -> obj.task1());
        Thread t2 = new Thread(() -> obj.task2());
        Thread t3 = new Thread(() -> obj.task3());
        t1.start();
        t2.start();
        t3.start();
    }
}
