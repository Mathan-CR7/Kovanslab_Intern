package com.kovanslab.intern.genericsandwildcards;
import java.util.*;

class Ecommerce <T,U>
{
    T item;
    U price;

    private List<T> items =new ArrayList<>();

    private List<U> prices =new ArrayList<>();

    public void setItems(T item,U price)
    {
        items.add(item);
        prices.add(price);
    }

    public T getItem(int index)
    {
        return items.get(index);
    }

    public U getPrice(int index)
    {
        return prices.get(index);
    }

    public int size()
    {
        return items.size();
    }

}

public class GenericsExample2 {
    public static void main(String[] args)
    {
        Ecommerce<String,Integer> p1 = new Ecommerce<>();

        p1.setItems("Apple",100);
        p1.setItems("Orange",150);
        p1.setItems("Banana",40);


        for(int i = 0; i < p1.size(); i++){
            System.out.println(p1.getItem(i) + " : " + p1.getPrice(i));

        }
    }
}
