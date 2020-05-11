package Repl_It.Arrays;

import java.util.Arrays;

public class _Arrays_add_Elements {
    public static void main(String[] args) {
        int[] arr1 = {10, 40, 50, 3, 1};
        int[] arr2 = {11, 0, 500, 44, 1101};

        int[] newArr = new int[arr1.length];


        for (int i = 0; i < newArr.length; i++) {

            newArr[i] = arr1[i] + arr2[i];
        }
        System.out.println(Arrays.toString(newArr));

    }

    public static int[] addElements(int[] ints1, int[] ints2) {
        int[] newArr = new int[ints1.length];


        for (int i = 0; i < newArr.length; i++) {

            newArr[i] = ints1[i] + ints2[i];
        }

        return newArr;


    }
}
