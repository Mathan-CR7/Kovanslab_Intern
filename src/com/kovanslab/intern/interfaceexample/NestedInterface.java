package com.kovanslab.intern.interfaceexample;
class A
{
    interface Student
    {
        void pass();
        void fail();
    }
}

class School implements A.Student
{
    public void pass()
    {
        System.out.println("Student pass");
    }
    public void fail()
    {
        System.out.println("Student Fail");
    }

}

public class NestedInterface {
    public static void main(String[] args) {
        A.Student s =new School();
        s.pass();
        s.fail();

    }
}
