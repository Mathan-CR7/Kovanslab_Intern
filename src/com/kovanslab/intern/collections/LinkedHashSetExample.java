package com.kovanslab.intern.collections;

import java.util.*;
public class LinkedHashSetExample {
    public static void main(String[] args)
    {
        Set<String> set =new LinkedHashSet<>();
        set.add("mathan");
        set.add("prashath");
        set.add("manoj");
        set.add("lingesh");
        set.add("mukesh");

        set.forEach(System.out::println);
    }
}
