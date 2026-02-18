package com.kovanslab.intern.collections;
import java.util.*;

public class ArrayDeQueExample {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        dq.add(10);
        dq.addFirst(20);
        dq.add(50);
        dq.add(60);
        dq.addLast(30);
        dq.addLast(40);

        System.out.println(dq);

        System.out.println(dq.remove(30));
        System.out.println(dq.removeFirst());
        System.out.println(dq.removeLast());

        System.out.println(dq);

        System.out.println(dq.size());

        System.out.println(dq.contains(50));

        System.out.println(dq.peekFirst());

        System.out.println(dq.peekLast());
    }
}
