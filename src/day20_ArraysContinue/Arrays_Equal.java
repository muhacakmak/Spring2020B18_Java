package day20_ArraysContinue;

import java.util.Arrays;

public class Arrays_Equal {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        boolean result = Arrays.equals(arr1, arr2);
        System.out.println(result);
        int[] arr3 = {3, 2, 1};
        int[] arr4 = {1, 2, 3};
        System.out.println(Arrays.equals(arr3, arr4));

        int[] arr5 = {3, 2, 1};
        int[] arr6 = {1, 2, 3};
        System.out.println("Before sort: " + Arrays.equals(arr5, arr6));
        Arrays.sort(arr5);//[1,2,3]
        Arrays.sort(arr6);//[1,2,3]
        System.out.println("After sort : " + Arrays.equals(arr5, arr6));
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3,4};

        System.out.println(Arrays.equals(array1,array2));




    }
}
