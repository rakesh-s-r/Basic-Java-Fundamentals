package OOPS.Advanced.Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeues {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(10);
        dq.add(20);
        dq.add(30);
        System.out.println(dq);

        dq.addFirst(1); // offerFirst also work but it return true/false
        dq.addLast(1000);
        System.out.println(dq);

        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq);

        System.out.println(dq.peek()); // peekFirst() also the same
        System.out.println(dq.getLast());
    }
}
