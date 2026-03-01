package com.kovanslab.intern.streams;
import java.util.*;
class Student
{
    String name;
    int marks;
    Student(String name,int marks)
    {
        this.name=name;
        this.marks=marks;
    }
}

public class StreamObjExample {
    public static void main(String[] args)
    {
        List<Student> studList = Arrays.asList
                (
                        new Student("mathan",65),
                        new Student("mukesh",90),
                        new Student("manoj",80)
                );

        studList.stream().filter(s->s.marks>70).forEach(s-> System.out.println(s.name + " "+s.marks));
        System.out.println("Marks Stord in Desc Order : ");
        studList.stream().sorted(Comparator.comparingInt( (Student s) -> s.marks).reversed()).forEach(s -> System.out.println(s.name + " " + s.marks));
    }
}
