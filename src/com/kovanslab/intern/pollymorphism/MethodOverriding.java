package com.kovanslab.intern.pollymorphism;


class Product
{
    int id=101;
    String name="Tv";
    void display()
    {
        System.out.println("Product Needs Electricity");
    }
}

class Cloth extends Product
{
    int id=103;
    String name = "Cloths";
    void display()
    {
        System.out.println("Clothing Products");
    }

}

public class MethodOverriding {
    public static void main(String[] args) {
        {
            Product c=new Cloth();
            System.out.println(c.id);
            System.out.println(c.name);
            c.display();
        }
    }
}

