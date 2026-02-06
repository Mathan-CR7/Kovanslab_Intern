package com.kovanslab.intern.inheritance;


class Products
{
    String name;
    int product_id;
    void display()
    {
        System.out.println(" Thank You ");
    }
}

class Cloth extends Products
{
    int price;
}

public class SingleInheritance
{
    public static void main(String[] args)
    {
        Cloth c= new Cloth();
        c.name="Coodie";
        c.product_id=101;
        c.price =250;
        System.out.println(" Product Name : "+ c.name);
        System.out.println(" Product ID : "+ c.product_id);
        System.out.println(" Product Price : "+ c.price);
        c.display();
    }
}