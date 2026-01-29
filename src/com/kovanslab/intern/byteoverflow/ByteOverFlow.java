package com.kovanslab.intern.byteoverflow;

public class ByteOverFlow {
    public static void main(String args[])
    {
        byte b= 126;

        for(int i=0;i<5;i++)
        {
            b++;
            System.out.println("Overflow Value" + b);
        }
    }
}
