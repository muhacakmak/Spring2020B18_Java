package day22_Arrays_Loops.WarmUp;

import java.util.Arrays;

public class ReverseArray {
    /*
            1. write a program that can reverse the array

     */
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
//        for (int i = arr.length - 1; i >= 0; i--) {
//            int eachNum = arr[i];
//            System.out.println(eachNum);
//
//        }

        System.out.println("========================================");

        int j = arr.length - 1;
        int[] reverseArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reverseArr[i] = arr[j];
            j--;
        }
//        reverseArr[0]=arr[4];
//        reverseArr[1]=arr[3];
//        reverseArr[2]=arr[2];
//        reverseArr[3]=arr[1];
//        reverseArr[4]=arr[0];
        System.out.println(Arrays.toString(reverseArr));


    }
}
