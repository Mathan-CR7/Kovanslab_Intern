package com.kovanslab.intern.constructors;

class College
{
    String name;
    int marks;
    College(int marks,String name)
    {
        this.name=name;
        this.marks=marks;
    }
}
public class ParameterizedConstructors {
    public static void main(String[] args) {
        {
            College c= new College(80,"Mathan");
            System.out.println(c.name);
            System.out.println(c.marks);
        }
    }
}

