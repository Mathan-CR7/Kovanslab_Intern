package com.kovanslab.intern.inheritanceovercomposition;
interface Course {
    void getCourse();
}

class JavaCourse implements Course {
    public void getCourse() {
        System.out.println("Learning Java ");
    }
}

class PythonCourse implements Course {
    public void getCourse() {
        System.out.println("Learning Python ");
    }
}


class Students {


    Course course;

    void study() {
        if (course == null) {
            System.out.println("No course assigned ");
        } else {
            course.getCourse();
            System.out.println("Student is studying ");
        }
    }
}

public class FieldInjection{
    public static void main(String[] args) {

        Students s = new Students();

        s.study();

        s.course = new JavaCourse();
        s.study();


        s.course = new PythonCourse();
        s.study();
    }
}
