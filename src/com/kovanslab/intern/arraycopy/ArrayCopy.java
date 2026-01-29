package com.kovanslab.intern.arraycopy;
import java.util.*;
public class ArrayCopy {

    public static void main(String[] args)
    {
        int[] a= {1,2,3,4};
        int[] b=new int[a.length];

        System.arraycopy(a, 2, b, 2, 2);
        System.out.println(Arrays.toString(b));
    }
}
