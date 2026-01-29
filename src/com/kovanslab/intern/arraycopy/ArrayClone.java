package com.kovanslab.intern.arraycopy;

public class ArrayClone {
    public static void main(String[] args) {
        int[] a= {1,2,3,4};
        int[] b=a.clone();

        b[1]=8;
        System.out.println(a[1]);
        System.out.println(b[1]);
    }
}
