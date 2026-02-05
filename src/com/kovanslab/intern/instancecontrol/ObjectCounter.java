package com.kovanslab.intern.instancecontrol;


class Demoz
{
    static int count=0;
    Demoz()
    {
        count++;
    }

}
public class ObjectCounter {
    public static void main(String[] args)
    {
        new Demoz();
        new Demoz();
        new Demoz();
        System.out.println(" Total Count : "+Demoz.count);
    }
}
