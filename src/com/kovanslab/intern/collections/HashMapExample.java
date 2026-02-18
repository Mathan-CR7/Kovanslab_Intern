package com.kovanslab.intern.collections;

import java.util.*;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Mathan");
        map.put(102, "Ravi");
        map.put(103, "Arun");
        map.put(104, "Karthik");

        System.out.println(map);
        System.out.println(map.get(102));
        System.out.println( map.containsKey(103));
        System.out.println( map.containsValue("Arun"));

        map.remove(104);
        System.out.println("After removing 104: " + map);
        map.replace(103, "Vijay");
        System.out.println("After replacing 103: " + map);
        System.out.println("Keys: " + map.keySet());

        System.out.println("Values: " + map.values());

        System.out.println("Entries: " + map.entrySet());

        System.out.println("Size: " + map.size());

        System.out.println("\nIterating using entrySet:");
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        map.clear();
        System.out.println("After clear(): " + map);

        System.out.println("Is map empty? " + map.isEmpty());
    }
}
