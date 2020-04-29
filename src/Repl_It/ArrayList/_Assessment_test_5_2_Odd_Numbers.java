package Repl_It.ArrayList;

import java.util.Scanner;

public class _Assessment_test_5_2_Odd_Numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("#1: ");
        int num1 = s.nextInt();
        System.out.print("#2: ");
        int num2 = s.nextInt();
        for (int i = num1; i <=num2; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

    }
//    public static void findOdd(int num1, int num2) {
//        for (int i = num1; i <=num2; i++) {
//            if (i % 2 != 0) {
//                System.out.print(i + " ");
//            }
//        }
//    }
}
