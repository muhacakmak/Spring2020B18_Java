package day43_MethodOverriding.task01;

public class ShapeObjects {


    public static void main(String[] args) {

        Circle circle1 = new Circle(3);

        System.out.println(circle1.radius);
        circle1.calculateArea();//  suppose to be :Pi *r*r
        circle1.calculatePerimeter();// bug
        System.out.println("===================================");

        Rectangle rectangle1 = new Rectangle(3, 2);
        System.out.println(rectangle1.length);
        System.out.println(rectangle1.width);

        rectangle1.calculateArea();// suppose to be :w*l
        rectangle1.calculatePerimeter();//bug
        System.out.println("===================================");

        Square square1=new Square(4);
        System.out.println(square1.side);

        square1.calculateArea();//bug suppose to be size
        square1.calculatePerimeter();// bug


    }
}

