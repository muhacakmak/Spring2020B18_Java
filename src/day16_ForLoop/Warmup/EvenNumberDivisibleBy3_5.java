package day16_ForLoop.Warmup;

import java.util.Scanner;

public class EvenNumberDivisibleBy3_5 {
    /*
    3. write a program that can calculate the sum of
    all the even numbers between 1 ~ 100

    4. write a program that can calculate the sum of
     all the odd numbers between 1 ~ 100
     */
    public static void main(String[] args) {
        int sumEven=0;
        int sumOdd=0;

        for (int i = 0; i <= 100; i++) {

            if(i%2==0){
                sumEven+=i;
            }else{
                sumOdd+=i;
            }
        }
        System.out.println("Sum of the even number 0~100 : "+sumEven);
        System.out.println("Sum of the odd number 0~100  : "+sumOdd);
    }
}

