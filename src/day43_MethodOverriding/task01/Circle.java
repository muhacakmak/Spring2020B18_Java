package day43_MethodOverriding.task01;

import java.text.DecimalFormat;

/*
2. create sub classes of Shape:
                Circle
                rectangle
                square
     give the instance variables that are
     needed to calculate the Area, perimeter, of those shapes
 */
public class Circle extends Shape {
    public double radius;
    public static double PI = 3.14;

    public Circle(double radius){
        this.radius = radius;
    }

    /*
    area , perimeter
    calculateArea & calculatePrimeter
     */


    public void calculateArea(){
        area = PI*radius * radius;
        System.out.println("Area of the Circle: "+area);
    }

    public void calculatePerimeter(){
        perimeter = radius * 2 * PI;
        System.out.println("Perimeter of the circle: "+perimeter);
    }




}
