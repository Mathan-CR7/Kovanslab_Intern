package com.kovanslab.intern.interfaceexample;
interface Product
{
    static void show()
    {
        System.out.println("All Types Of Products");
    }
}



public class StaticInterface {
    public static void main(String[] args)
    {
        Product.show();
    }
}
