package day07_IfStatements;

import java.util.Scanner;
/*
1. A triangle is valid if the sum of all the three
angles is equal to 180 degrees. Write a program
that declares three integers as angles and check
whether a triangle is valid or not.
 */

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double angle1 = scan.nextDouble();
        double angle2 = scan.nextDouble();
        double angle3 = scan.nextDouble();
        short sumAngles = (short)(angle1 + angle2 + angle3);

        if(sumAngles==180){
            System.out.println("The shape is a triangle");
        }
        if(sumAngles!=180){
            System.out.println("The shape is not a valid triangle");
        }
    }
}
