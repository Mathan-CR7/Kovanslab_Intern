package com.kovanslab.intern.collections;


import java.util.*;
public class ArrayListExample
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);

        System.out.println(list.get(2));

        list.set(2,70);

        System.out.println(list);

        list.remove(2);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(20));
        list.clear();
        System.out.println(list);
        if(list.isEmpty())
        {
            System.out.println("Array is Empty");
        }
    }
}