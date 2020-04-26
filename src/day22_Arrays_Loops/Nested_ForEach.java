package day22_Arrays_Loops;

import java.util.Arrays;

public class Nested_ForEach {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        for (int each : arr) {
            System.out.print(each);

        }
        System.out.println("=========================");

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}};

        for (int[] each1DArray : arr2D) {
            for (int eachElement : each1DArray) {
                System.out.print(eachElement + " ");
            }
        }
        System.out.println();

        System.out.println("=========================");
        char[][] ch2D = {{'A', 'B'}, {'C', 'D', 'E'}};
        //                  0          1

        for (char[] each1DArray : ch2D) {
            for (char eachElement:each1DArray){
                System.out.print(eachElement+" ");
            }

        }


    }


}
