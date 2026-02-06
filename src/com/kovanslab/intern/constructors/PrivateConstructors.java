package com.kovanslab.intern.constructors;


class Demo
{
    private static Demo obj;

    private Demo()
    {
        System.out.println("Object is Created");
    }

    public static Demo getInstance()
    {
        if(obj==null)
        {
            obj = new Demo();
        }
        return obj;
    }
}
public class PrivateConstructors {
    public static void main(String[] args)
    {
        Demo d1 = Demo.getInstance();
        Demo d2 = Demo.getInstance();

        System.out.println(d1==d2);
    }
}
