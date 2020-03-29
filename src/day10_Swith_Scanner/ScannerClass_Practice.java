package day10_Swith_Scanner;

import java.util.Scanner;
/*
    write a program that asks user to enter num1 and num2, adn then prints the sum
 */
public class ScannerClass_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        byte num1 = input.nextByte();
        System.out.print("Enter second number: ");
        byte num2 = input.nextByte();
        int total=num1+num2;
        System.out.println("The sum of "+num1+" and "+num2+" is : "+total);


    }
}
