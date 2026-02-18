package com.kovanslab.intern.collections;

import java.util.*;

public class PerformanceTest{

    public static void main(String[] args) {

        int n = 1_000_000;

        List<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            arrayList.add(i);
        }

        long startArray = System.nanoTime();

        int middleArray = arrayList.get(n/2);

        long endArray = System.nanoTime();

        System.out.println("ArrayList Middle Element: " + middleArray);
        System.out.println("ArrayList get() Time: " + (endArray - startArray) + " ns");

        List<Integer> linkedList = new LinkedList<>();

        for(int i = 0; i < n; i++) {
            linkedList.add(i);
        }

        long startLinked = System.nanoTime();

        int middleLinked = linkedList.get(n/2);

        long endLinked = System.nanoTime();

        System.out.println("\nLinkedList Middle Element: " + middleLinked);
        System.out.println("LinkedList get() Time: " + (endLinked - startLinked) + " ns");
    }
}
