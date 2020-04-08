package day18_nestedLoops;

import java.util.Scanner;

public class Factorial {
    /*
    2. write a program that can retunr the factorial number of any given number
			Ex:
				input: 5
				output: 120
			because:
				5! = 5 * 4 * 3 * 2* 1 = 120
     */
    public static void main(String[] args) {
        System.out.print("Enter a number: ");

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        System.out.print(num);

        int result = 1;
        while (num >= 1) {

            result *= num;

            num--;
        }
        System.out.print(" ! = " + result);

    }
}
