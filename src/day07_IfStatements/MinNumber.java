package day07_IfStatements;

import java.util.Random;

/*
 3. write a java program that accepts
 three numbers and return the minimum number
  (assume that none of them are equal)
 */
public class MinNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(100);
        int b = random.nextInt(100);
        int c = random.nextInt(100);

        System.out.println("Three number :" +  a + " , " +  b + " , " + c + " ");

        if (a < b && a < c) {
            System.out.println(a + " is less than " + b + " and "
                    + c + ", then " + a + " is minimum");
        }
        if (b < a && b < c) {
            System.out.println(b + " is less than " + a + " and "
                    + c + ", then " + b + " is minimum");
        }
        if (c < a && c < b) {
            System.out.println(c + " is less than " + b + " and "
                    + a + ", then " + c + " is minimum");
        }


    }
}
