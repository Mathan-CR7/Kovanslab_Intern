package com.kovanslab.intern.collections;
import java.util.HashMap;

class PersonWrong {

    String name;
    int age;

    PersonWrong(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {

        PersonWrong p = (PersonWrong) obj;

        if(this.name.equals(p.name) && this.age == p.age)
            return true;

        return false;
    }
}

public class CustomKey{

    public static void main(String[] args) {

        HashMap<PersonWrong, String> map = new HashMap<>();

        PersonWrong p1 = new PersonWrong("Mathan", 20);
        PersonWrong p2 = new PersonWrong("Mathan", 20);

        map.put(p1, "Student");

        System.out.println("p1 equals p2 : " + p1.equals(p2));
        String value = map.get(p2);

        System.out.println("Value using p2 key : " + value);
    }
}
