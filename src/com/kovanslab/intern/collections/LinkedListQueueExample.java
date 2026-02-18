package com.kovanslab.intern.collections;
import java.util.*;
public class LinkedListQueueExample {
    public static void main(String[] args) {
        // Queue<Integer> q =new ArrayBlockingQueue<>(2);
        // q.offer(10);
        // q.offer(20);
        // boolean a=q.offer(30);
        // System.out.println(q);
        // System.err.println(a);

        // q.clear();

        // System.out.println(q);
        // System.out.println(q.poll());

        // System.out.println(q.peek());


        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.offer(50);
        System.out.println(q);

        System.out.println(q.peek());

        System.out.println(q.poll());

        System.out.println(q);

        System.out.println(q.size());

        System.out.println(q.isEmpty());
    }
}
