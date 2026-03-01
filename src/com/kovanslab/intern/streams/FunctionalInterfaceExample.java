package com.kovanslab.intern.streams;

import java.util.function.Function;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        Function<Integer,Integer> square = s -> (s*s);
        Function<Integer,Integer> mul= k->k*2;
        Function<Integer,Integer> res=square.andThen(mul);
        System.out.println(square.apply(5));

        Function<String,Integer> len =m->m.length();
        System.out.println(len.apply("mathan"));

        Function<String,String> upp = x-> x.toUpperCase();
        System.out.println(upp.apply("mathan"));

        System.out.println(res.apply(5));

        Function<Integer,Integer> ans= square.compose(mul);

        System.out.println(ans.apply(10));


    }
}
