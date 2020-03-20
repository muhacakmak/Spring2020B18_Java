package day07_IfStatements;
/*
  4. write a java program that accepts three numbers and return the medium number
                (assume that none of them are equal)
 */

import java.util.Random;

public class MediumNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(100);
        int b = random.nextInt(100);
        int c = random.nextInt(100);

        System.out.println("Three number :" +  a + " , " +  b + " , " + c + " ");

        if ((a > b && c > a) || (a>c && b>a)) {
            System.out.println(a + " is medium number");
        }
        if ((b > a && c > b) || (b<a && c<b )) {
            System.out.println(b + " is medium number");
        }
        if ((c > a && c < b)|| (c<a && c>b)) {
            System.out.println(c + " is medium number");
        }
    }
}
