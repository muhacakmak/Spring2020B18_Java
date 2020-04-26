package Repl_It.Loop;

import java.util.Scanner;

public class LoopCalculateMultiplied_sum_of_number {
    /*
    calculate the multiplied sum of all the numbers up to the n variable.
       for example:
        n=2
         sum = 1*2 = 2
         n=3
        sum = 1*2*3 = 6
        n = 5
         sum = 1*2*3*4*5 = 120
        hint: use a loop, and set sum and i (loop iterator) to one at the start
     */
    public static void main(String[] args) {
        // 5!= 5*4*3*2*1
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        // n=2

        /*
        n=3
        result=3*2*1


         */
//        5=5+4+3+2+1
        int sum=0;//0+1=1+2=3+3=6+4=10+5=15
        //       i  1
        for (int i = 1; i <=5 ; i++) {


        }
        System.out.println(sum);


    }
}
