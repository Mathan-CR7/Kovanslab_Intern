package com.kovanslab.intern.constructors;

class Kovan
{
    int id;
    String name;

    Kovan(int id,String name)
    {
        this.id=id;
        this.name=name;
    }

    Kovan(Kovan k)
    {
        this.id=k.id;
        this.name=k.name;

    }

}

public class CopyConstructors {
    public static void main(String[] args)
    {
        Kovan k= new Kovan(101,"Mathan");
        Kovan k1= new Kovan(k);
        System.out.println(k.id);
        System.out.println(k.name);
        System.out.println(k1.id);
        System.out.println(k1.name);

    }
}

