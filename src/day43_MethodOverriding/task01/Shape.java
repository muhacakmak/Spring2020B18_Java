package day43_MethodOverriding.task01;
/*
1. create a class called Shape
    Actions:
                methods: calculateArea(), calculatePerimeter()
 */
public class Shape {

    public double area;
    public double perimeter;

    public void calculateArea(){
        area = 0;
        System.out.println("Area of the shape: "+area);
    }

    public void calculatePerimeter(){
        perimeter = 0;
        System.out.println("Perimeter of the shape: "+perimeter);
    }
}
