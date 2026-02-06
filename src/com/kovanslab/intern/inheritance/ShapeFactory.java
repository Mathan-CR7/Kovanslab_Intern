package com.kovanslab.intern.inheritance;

abstract class Shape{
    abstract double area();
}

class Circle extends Shape
{
    private double r;

    Circle(double r)
    {
        this.r=r;
    }
    double area()
    {
        return Math.PI*r*r;
    }
}

class Square extends Shape
{
    private double side;

    Square(double side)
    {
        this.side=side;

    }

    double area()
    {
        return side*side;
    }
}

public class ShapeFactory {
    public static void main(String[] args) {

        Shape[] shapes =new Shape[3];
        shapes[0]=new Circle(3);
        shapes[1] =new Square(2);
        shapes[2] =new Circle(4.5);

        double totalArea=0;

        for(Shape s : shapes)
        {
            totalArea += s.area();
        }
        System.out.println("Total Area = "+totalArea);
    }
}
