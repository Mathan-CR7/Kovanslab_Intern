package com.kovanslab.intern.collections;
import java.util.*;
public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq =new PriorityQueue<>();
        pq.add(7);
        pq.add(4);
        pq.add(2);
        pq.add(10);
        pq.add(1);
        pq.add(15);
        pq.add(6);

        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

    }
}
