package com.kovanslab.intern.genericsandwildcards;

class Sum<T extends Number>
{
    T num1,num2;

    Sum(T num1, T num2)
    {
        this.num1=num1;
        this.num2=num2;
    }
    public double add()
    {
        return num1.doubleValue()+num2.doubleValue();
    }
    public static <T extends Number> double multiply(T a, T b){
        return a.doubleValue() * b.doubleValue();
    }

}
public class BoundedTypeParameters {
    public static void main(String[] args)
    {
        Sum<Integer> s =new Sum(10, 20);
        System.out.println(s.add());
        System.out.println(s.multiply(2.3, 5.4));
    }
}
