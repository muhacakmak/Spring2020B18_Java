package day16_ForLoop.Warmup;

import java.util.Scanner;

public class OddNumberDivisibleBy3_5 {
    /*
    1. write a program that can print all the ODD numbers
    between 1 ~ 100 that can be divisible by 3 & 5
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter start number:");
        int start = input.nextInt();
        System.out.print("Enter end number: ");
        int end = input.nextInt();
        String result = " ";
        System.out.print("Odd number between "+start+" ~ "+end+": ");
        for (int number = start; number <= end; number++) {

            if (number%2!=0) {
                if (number % 3 == 0 && number % 5 == 0) {
                    result = number + " ";
                    System.out.print(result);
                }
            }
        }
    }
}
