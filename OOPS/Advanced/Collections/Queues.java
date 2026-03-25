package OOPS.Advanced.Collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        queuesMethod();
        priorityQueues();
    }

    public static void queuesMethod() {
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);

        // both methods are same
        System.out.println(q.peek());
        System.out.println(q.element());

        System.out.println(q.poll());
        System.out.println(q.size());
        System.out.println(q);
        System.out.println(q.isEmpty());
    }

    /*
     * Add and Offer: O(log n)
     * Peak: O(1)
     * poll and remove head element: O(log n)
     * Remove arbitrary element: O(n)
     */
    public static void priorityQueues() {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(10);
        pq.add(50);
        pq.add(30);
        pq.add(2);

        for (Integer pq2 : pq) {
            System.out.println(": " + pq2);
        }
        System.out.println(pq);
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
