package day07_IfStatements;

import java.util.Random;
import java.util.Scanner;

/*
2. write a java program that accepts three
numbers and return the maximum number
  (assume that none of them are equal)
 */
public class MaxNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(100);
        int b = random.nextInt(100);
        int c = random.nextInt(100);

        System.out.println("Three number :" +  a + " , " +  b + " , " + c + " ");

        if (a > b && a > c) {
            System.out.println(a + " is greater than " + b + " and "
                    + c + ", then " + a + " is maximum");
        }
        if (b > a && b > c) {
            System.out.println(b + " is greater than " + a + " and "
                    + c + ", then " + b + " is maximum");
        }
        if (c > a && c > b) {
            System.out.println(c + " is greater than " + b + " and "
                    + a + ", then " + c + " is maximum");
        }


    }
}
