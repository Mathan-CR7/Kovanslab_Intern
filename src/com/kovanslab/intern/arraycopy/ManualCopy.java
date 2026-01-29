package com.kovanslab.intern.arraycopy;

public class ManualCopy {
    public static void main(String[] args) {

        int[]a={1,2,3,4};
        int[]b=new int[a.length];

        for(int i=0;i<a.length;i++)
        {
            b[i] =a[i];
        }
        b[1] =100;
        System.out.println(a[1]);

    }
}
