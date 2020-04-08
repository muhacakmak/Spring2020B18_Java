package day03_VariablesContinue;
/*
Scanner_Practice1 07:
  create a class called Sequare, and write a program that can calculate the areas
  and perimeters of the sequare based on the lengthMethods of the sequare, and print the result
  Note: you only need to lengthMethods of the sequare in order to calculate the area and perimeter
 */
public class Square {
    public static void main(String[] args) {
        double length=10;
        double areaOfSquare=length*length;
        double perimeterOfSquare=length*4;


        System.out.println("The area for the square of lengthMethods "+length+ "cm  is "+areaOfSquare+" cm^2. ");
        System.out.println("The perimeter for the square of lengthMethods "+length+ " is "+perimeterOfSquare+" cm.");


    }
}
