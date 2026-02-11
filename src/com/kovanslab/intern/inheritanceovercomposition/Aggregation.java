package com.kovanslab.intern.inheritanceovercomposition;
class Address {
    String city;
    String state;

    Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    void displayAddress() {
        System.out.println(city + ", " + state);
    }
}


class Student {
    String name;
    Address address;

    Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.print(name + " lives in ");
        address.displayAddress();
    }
}

public class Aggregation {
    public static void main(String[] args) {

        Address addr = new Address("Chennai", "Tamil Nadu");

        Student s1 = new Student("Madhan", addr);
        s1.display();
    }
}
