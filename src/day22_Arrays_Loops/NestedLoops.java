package day22_Arrays_Loops;

import java.util.Arrays;

public class NestedLoops {
    public static void main(String[] args) {


        char[][] arr2D = {{'A', 'B'}, {'C', 'D', 'E'}, {'F', 'J', 'H'}};
        //               0            1           2

        for (int i = 0; i < arr2D[0].length; i++) {
            System.out.println(arr2D[0][i]);

        }
        System.out.println();
        System.out.println("==================================");
        for (int i = 0; i < arr2D[1].length; i++) {
            System.out.println(arr2D[1][i]);
        }
        System.out.println("==================================");

        for (int i = 0; i < arr2D[2].length; i++) {
            System.out.println(arr2D[2][i]);
        }
        System.out.println("==================================");

        for (int j = 0; j < arr2D.length; j++) {
            for (int i = 0; i < arr2D[j].length; i++) {
                System.out.println(arr2D[j][i]);

            }


        }
    }
}

