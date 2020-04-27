package Repl_It.Methods;

import java.util.Arrays;

public class _176_Method_Overloading_1_group {
    public static void main(String[] args) {
        //                0  1   2   3  4   5
        int[] arr = {2, -3, 36, 6, 9, 99};//
        System.out.println(findMax(arr));

    }

    public static int findMax(int[] arr) {
        int maxNumber = arr[0];
        for (int i = 0; i < arr.length; i++) {//
            int number = arr[i];// 2,-3
            if (number > maxNumber) {
                maxNumber = number;
            }

        }
        return maxNumber;
    }

    public static double findMax(double[] arr) {
        double maxNumber = arr[0];
        for (int i = 0; i < arr.length; i++) {//
            double number = arr[i];// 2,-3
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        return maxNumber;
    }
}
