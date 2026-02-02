package com.kovanslab.intern.passbyvalueandrefference;

public class PassByRefference {
    static class Student {
        int marks;
    }

    static void update(Student s) {
        s.marks = 80;
    }

    public static void main(String[] args) {
        Student st = new Student();
        st.marks = 90;

        update(st);
        System.out.println(st.marks);
    }
}
