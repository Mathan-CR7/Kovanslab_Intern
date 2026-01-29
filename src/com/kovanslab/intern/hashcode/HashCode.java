package com.kovanslab.intern.hashcode;

public class HashCode {
    public static void main(String[] args)
    {
        String s1="Hello";
        String s2="Hello";
        String s3= new String("Hello");
        System.out.println("S1 HashCode = " + System.identityHashCode(s1));
        System.out.println("S2 HashCode = " + System.identityHashCode(s2));
        System.out.println("S3 HashCode = " + System.identityHashCode(s3));

        System.out.println(s1==s2); //true
        System.out.println(s1==s3); //false
    }

}

