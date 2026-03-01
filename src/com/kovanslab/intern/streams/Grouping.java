package com.kovanslab.intern.streams;
import java.util.*;
import java.util.stream.Collectors;
class Employee
{
    String name;
    String dept;
    int salary;

    Employee(String name,String dept,int salary)
    {
        this.name=name;
        this.dept=dept;
        this.salary=salary;
    }
    public String toString() {
        return name + " - " + salary;
    }
}

public class Grouping {
    public static void main(String[] args)
    {
        List<Employee> emp= Arrays.asList(
                new Employee("Mathan", "AIDS", 100000),
                new Employee("Mukesh", "AIDS", 200000),
                new Employee("Manoj", "AIDS", 300000),
                new Employee("Santhosh", "CSE", 150000),
                new Employee("Sarathi", "IT", 250000),
                new Employee("Surya", "CSE", 350000)
        );

        Map<String,List<Employee>>  group = emp.stream().collect(Collectors.groupingBy(e -> e.dept));
        group.forEach((em,dep) -> System.out.println(dep));
    }
}
