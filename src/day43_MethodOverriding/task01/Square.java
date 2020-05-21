package day43_MethodOverriding.task01;
/*
2. create sub classes of Shape:
                Circle
                rectangle
                square
     give the instance variables that are needed
     to calculate the Area, perimeter, of those shapes
 */
public class Square extends Shape{
    public double side;
    public Square(double side){
        this.side =side;

    }
    public void calculateArea(){
        area = side*side;
        System.out.println("Area of the square: "+area);
    }

    public void calculatePerimeter(){
        perimeter = 4*side;
        System.out.println("Perimeter of the square: "+perimeter);
    }


}
