package OOPS.Basic.classes;

// Anonymous class is class without class name it can create for one time implementation and execute using multi-threads
class Anonymous implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " class without name is executing");
    }

    public static void main(String[] args) {
        Runnable obj = new Anonymous();

        Thread r1 = new Thread(obj);
        Thread r2 = new Thread(obj);

        r1.start();
        r2.start();
    }
}