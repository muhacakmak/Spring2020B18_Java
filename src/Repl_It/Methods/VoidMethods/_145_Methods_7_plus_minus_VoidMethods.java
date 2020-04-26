package Repl_It.Methods.VoidMethods;

import java.util.Scanner;

public class _145_Methods_7_plus_minus_VoidMethods {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <= size - 1; i++) {
            arr[i] = inp.nextInt();
        }
        plus_minus(arr);
    }
    public static void plus_minus(int[] arr) {
        int countZero = 0;
        int countPositive = 0;
        int countNegative = 0;

        for (int eachNumber : arr) {
            if (eachNumber > 0) {
                countPositive++;
            }
            if (eachNumber < 0) {
                countNegative++;
            }
            if (eachNumber == 0) {
                countZero++;
            }
        }
        System.out.println("Positives:" + countPositive + ", negatives:" + countNegative + ", zeros:" + countZero);
    }
}
