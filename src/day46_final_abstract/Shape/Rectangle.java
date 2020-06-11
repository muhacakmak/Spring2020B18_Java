package day46_final_abstract.Shape;

import day46_final_abstract.Shape.Shape;

public class Rectangle extends Shape {
    public double width;
    public double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public void Area(){
        double area=width*length;
        System.out.println("Area of rectangle: "+area);

    }

}
