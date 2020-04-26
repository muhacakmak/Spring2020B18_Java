package day22_Arrays_Loops;

import java.util.Arrays;

public class NestedLoops2 {
    public static void main(String[] args) {
        int[][] numbers = {{9, 8, 7}, {6}, {5, 4, 3, 2, 1, 0}};
        //     0     1    2
        /*
        numbers[0]==> {9, 8, 7}     number[0][i]   i needs tp be repeated three times
        numbers[1]==> {6}           number[1][i]   i needs to be  repeated one time
        numbers[2]==> {5,4,3,2,1,0}  number[2][i]   i needs to be repeated six times

        */
        for (int k = 0; k <numbers.length ; k++) {


            for (int i = 0; i < numbers[k].length; i++) {

               // System.out.print(numbers[k][i]+" ");


            }
            System.out.println();
        }
        // [[9, 8, 7], [6], [5, 4, 3, 2, 1, 0]]
        //

        // 7 8 9 6 0 1 2 3 4 5

        for (int k = 0; k <numbers.length ; k++) {

            for (int i = numbers[k].length-1; i>=0 ; i--) {
                System.out.print(numbers[k][i]+" ");


            }


        }
        System.out.println();
        // [[9, 8, 7], [6], [5, 4, 3, 2, 1, 0]]
        //5 4 3 2 1 0 6 9 8 7


        for (int k = numbers.length-1; k >=0 ; k--) {
            for (int i = 0; i <numbers[k].length; i++) {
                System.out.print(numbers[k][i]+" ");

            }

        }
        System.out.println();
        //0 1 2 3 4 5 6 7 8 9
        for (int k =numbers.length-1; k>=0 ; k--) {

            for (int i = numbers[k].length-1; i >=0 ; i--) {

                System.out.print(numbers[k][i]+" ");

            }

        }


    }
}
