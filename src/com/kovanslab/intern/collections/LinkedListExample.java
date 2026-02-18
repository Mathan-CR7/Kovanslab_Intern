package com.kovanslab.intern.collections;
import java.util.*;
public class LinkedListExample
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list =new LinkedList<>();

        list.add(10);
        list.add(15);
        list.add(20);
        list.addFirst(5);
        list.addLast(25);

        System.out.println(list);

        list.remove();
        System.out.println(list.indexOf(15));
        list.removeFirst();

        System.out.println(list);

        list.clear();

        System.out.println(list);

        if(list.isEmpty())
        {
            System.out.println("List is empty");
        }
    }
}