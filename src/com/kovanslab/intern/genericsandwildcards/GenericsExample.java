package com.kovanslab.intern.genericsandwildcards;
class Products <T,U>
{
    T item;
    U price;

    public void setItem(T item ,U price)
    {
        this.item =item;
        this.price =price;
    }

    public T getItem()
    {
        return this.item;
    }
    public U getPrice()
    {
        return this.price;
    }
}

public class GenericsExample
{
    public static void main(String[] args) {

        Products<String,Integer> p1 = new Products<>();
        p1.setItem("Apple",100);
        p1.setItem("orange",150);
        p1.setItem("Banana",40);

        System.out.println(p1.getItem());
        System.out.println(p1.getPrice());

        Products<String,Double> p2 = new Products<>();
        p2.setItem("Pencil", 10.5);

        System.out.println(p2.getItem());
        System.out.println(p2.getPrice());





    }
}
