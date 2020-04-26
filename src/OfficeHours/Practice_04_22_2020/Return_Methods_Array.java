package OfficeHours.Practice_04_22_2020;

import java.util.Arrays;

public class Return_Methods_Array {
    // write a return methods that can return the second maximum number from an int array

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(secondMax(arr));

    }

    public static int secondMax(int[] arr) {
        int secondMaximum = 0;
        Arrays.sort(arr);
        secondMaximum = arr[arr.length - 2];
        return secondMaximum;
    }
}
