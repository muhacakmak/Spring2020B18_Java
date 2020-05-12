package day38_Constructors.task1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Circle {
    /*
    Create a class called Circle
            instance variables:
                    radius, pi, diameter
            add a constructor that can initialize the radius of the circle
            instance methods:
                    area(): can return the area of the circle as double
                    perimeter(): cna return the perimeter of the circle as double
                    toString(): returns the info of the circle
            Note: global value of PI is 3.14
                  diameter of circle = 2 * radius
                  area of circle = PI * r * r
     */

    double radius;
    static double pi = 3.14;
    double diameter;

    public Circle(double radius) {
        this.radius = radius;
        diameter=2*radius;

    }

    public double area() {
        return pi * radius * radius;
    }

    public double perimeter() {
        return  diameter*pi;// 2*radius*pi//  2*5*3=3*5*2
        // diameter=2*radius//    diameter*pi


    }

    public String toString() {
        return "radius:" + radius + ", diameter:" + diameter+", Circles area: "+area()+", Circles perimeter: "+perimeter();
    }
}
class circleObjects{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the radius of the circle :");
        double r=scan.nextDouble();
        DecimalFormat df=new DecimalFormat("0.00");

        Circle circle1=new Circle(r);
        System.out.println("Diameter is "+circle1.diameter);
        System.out.println("Area: "+df.format(circle1.area()));
        System.out.println("Perimeter of "+circle1.perimeter());

    }
}
