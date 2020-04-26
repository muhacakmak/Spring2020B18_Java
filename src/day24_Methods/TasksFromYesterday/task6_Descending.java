package day24_Methods.TasksFromYesterday;

import java.util.Arrays;

public class task6_Descending {
    /*
    6. create a function that can print out the array in descending order
        [1,2,3] == > [3,2,1]
     */
    public static void main(String[] args) {
        int[] array = {10, 8, 9, 5, 4, 3, 2, 1};
        descending(array);

    }
    public static void descending(int[] array) {
        Arrays.sort(array);
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
