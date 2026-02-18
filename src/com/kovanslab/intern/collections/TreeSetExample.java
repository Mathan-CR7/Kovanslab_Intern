package com.kovanslab.intern.collections;
import java.util.*;
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> set =new TreeSet<>();
        set.add(10);
        set.add(15);
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(20);

        System.out.println(set);

        set.remove(5);

        System.out.println(set);

        System.out.println(set.contains(10));

        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println(set.higher(10));
        System.out.println(set.ceiling(11));
        System.out.println(set.floor(4));
        System.out.println(set.pollFirst());
        System.out.println(set);
    }
}
