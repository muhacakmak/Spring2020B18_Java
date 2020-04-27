package Repl_It.Methods.VoidMethods;

import java.util.Scanner;

public class _147_Methods_9_isPos_Void_Methods_emrah {
    /*
    isPos is a method that checks if  an int positive or not positive
   1. If  the int num is positive print positive else print not positive
    2. Complete main method by calling isPos method for each element in the array arr.
   */
    public static void main(String[] args) {
//        Scanner inp = new Scanner(System.in);
//        int size = inp.nextInt();
//        int[] arr = new int[size];//
//        for (int i = 0; i <= size - 1; i++) {
//
//            arr[i] = inp.nextInt();
//        }
        //           0  1  2
        int[] arr = {2, 5, 3,};

//        if (arr[0] > 0) {
//            System.out.println("positive");
//        } else {
//            System.out.println("Negative");
//        }
//        if (arr[1] > 0) {
//            System.out.println("positive");
//        } else {
//            System.out.println("Negative");
//        }
//        if (arr[2] > 0) {
//            System.out.println("positive");
//        } else {
//            System.out.println("Negative");
//        }
//                            3
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>3){
                System.out.println(arr[i]);;
            }else{
                System.out.println("noting");

            }

        }


//        for (int num:arr) {
//            isPos(num);
//
//
//        }
    }

    public static void isPos(int num) {

        if (num > 0) {
            System.out.println("positive");
        } else {
            System.out.println("not positive");
        }


    }
}
