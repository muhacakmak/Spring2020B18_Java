package day43_MethodOverriding.task01;

public class Rectangle extends Shape{
    /*
    inherited :
            area, perimeter
            calculateArea()
            calculatePerimeter()
     */

    public double width;
    public double length;

    public Rectangle(double length,double width){
        this.width=width;
        this.length=length;
    }
    public void calculateArea(){
        area = width*length;
        System.out.println("Area of the rectangle: "+area);
    }
    public void calculatePerimeter(){
        perimeter = 2*(length+width);
        System.out.println("Perimeter of the rectangle: "+perimeter);
    }


}
