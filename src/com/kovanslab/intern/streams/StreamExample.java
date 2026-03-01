package com.kovanslab.intern.streams;

import java.util.*;

public class StreamExample {
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(2,3,4,5,6,7,89,9,10);
        long l= list.stream().filter(n->n%2==0).count();

        System.out.println(l);

        List<String> str =Arrays.asList("mathan","prasath","mukesh");
        str.stream().map(name->name.toUpperCase()).forEach(System.out::println);

        List<Integer> nums = Arrays.asList(8,5,11,2,7,3,4,4,3,2);
        nums.stream().filter(n->n%2==0).sorted().distinct().limit(3).forEach(System.out::println);

        System.out.println("Sorted in Desc order : ");
        List<Integer> li = Arrays.asList(2,3,4,5,6,7,8,9);
        li.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
