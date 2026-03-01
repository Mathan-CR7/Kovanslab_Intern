package com.kovanslab.intern.files;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;
import java.io.Serializable;


class Student implements Serializable {
    int id;
    String name;
    int marks;

    Student(int id,String name,int marks) {
        this.id=id;
        this.name=name;
        this.marks=marks;
    }


}
public class DeSerializableExample {
    public static void main(String[] args) {
        try(
                FileInputStream fi =new FileInputStream("C:\\Users\\Mathan.R\\Desktop\\kovanlabs_intern\\Week-01\\student.dat");
                ObjectInputStream oi =new ObjectInputStream(fi))
        {
            Student s1 =(Student) oi.readObject();
            System.out.println("ID " + s1.id);
            System.out.println("Name "+ s1.name);
            System.out.println("Marks "+s1.marks);
        }
        catch(Exception e)
        {
            System.out.println("An error Occur");
        }

    }
}

