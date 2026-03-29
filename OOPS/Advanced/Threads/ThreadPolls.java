package OOPS.Advanced.Threads;

import java.util.concurrent.*;

class CustomThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setPriority(Thread.NORM_PRIORITY);
        t.setDaemon(false);
        return t;
    }
}

class CustomRejectionHandler implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("Task reject " + r.toString());
    }
}

public class ThreadPolls {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                2,
                4,
                1,
                TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(2),
                new CustomThreadFactory(),
                new CustomRejectionHandler());
        for (int i = 0; i < 4; i++) {
            executor.submit(() -> {
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                }
                System.out.println("Task executing " + Thread.currentThread().getName());
            });
        }
        executor.shutdown();
    }
}
