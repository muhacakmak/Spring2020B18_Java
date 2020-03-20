package day03_VariablesContinue;
/*
 task 06:
        create a class called Circle, and write a program that can calculate
        the areas and perimeters of the circle based on the value of the radius,
        and print the result
        Note: assume that pi is equal to 3.14, and you only need to radius in order
        to calculate the area and perimeter, and print the result
 */
public class Circle {
    public static void main(String[] args) {
        int radius=20;
        double pi=3.14;
        double areasOfCircle=pi*radius*radius;
        double perimeterOfCircle=2*pi*radius;
        System.out.println("The area for the circle of radius "+radius+ " is "+areasOfCircle);
        System.out.println("The perimeter for the circle of radius "+radius+ " is "+perimeterOfCircle);


    }
}
