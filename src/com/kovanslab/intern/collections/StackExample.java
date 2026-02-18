package com.kovanslab.intern.collections;
import java.util.*;
public class StackExample {
    public static void main(String[] args) {
        Stack<String> s= new Stack<>();
        s.push("java");
        s.push("python");
        s.push("c");
        s.push("DBMS");

        System.out.println(s);

        s.pop();
        System.out.println(s);

        System.out.println(s.peek());

        System.out.println(s.contains("c"));

        System.out.println(s.indexOf("c"));

        System.out.println(s.size());

        System.out.println(s.search("c"));
    }
}
