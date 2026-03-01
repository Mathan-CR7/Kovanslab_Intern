package com.kovanslab.intern.files;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Students implements Serializable
{
    int id;
    String name;
    int marks;

    Students(int id,String name,int marks)
    {
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
}

public class SerializableExample {
    public static void main(String[] args) {
        Students s1 =new Students(1, "mathan", 80);
        try( FileOutputStream fo =new FileOutputStream("student.dat");
             ObjectOutputStream os =new ObjectOutputStream(fo);)
        {
            os.writeObject(s1);
            System.out.println("Object Convert into file");
        }
        catch(Exception e)
        {
            System.out.println("An Error Occur");
        }

    }
}
