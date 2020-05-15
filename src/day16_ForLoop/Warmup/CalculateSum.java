package day16_ForLoop.Warmup;

import java.util.Scanner;

public class CalculateSum {
 /*   7. write a program that can calculate the sum of
    all numbers between 1 to any given number
    Pizza:
    input: 100
    output: 5050
    input: 50
    output: 1275
    input : 200
    output : 20100
    Aa Bb Cc Dd  ...

  */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=input.nextInt();
        int sum=0;
        for (int i = 1; i <=number ; i++) {
            sum+=i;
        }
        System.out.println("\nSum of the number between 1 ~ "+number+" :  "+sum);
    }

}
