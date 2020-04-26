package day24_Methods.TasksFromYesterday;

import java.util.Arrays;

public class task4_maxNum_minNum {
    /*
    4. creata a function that can print the maximum number from any given array
        5. creata a function that can print the minimum number from any given array


     */
    public static void main(String[] args) {
        int[] array = {10, 8, 9, 5, 4, 3, 2, 1};

        maxNumber(array);
        minNumber(array);
        int[] arr2 = {100, 20, 30, 40, 40, -100};
        maxNumber(arr2);
        minNumber(arr2);

    }

    public static void maxNumber(int[] array) {
        Arrays.sort(array);
        System.out.println("Maximum number is :" + array[array.length - 1]);

    }

    public static void minNumber(int[] array) {
        Arrays.sort(array);
        System.out.println("Minimum number is : " + array[0]);
    }
}
