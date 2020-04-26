package day20_ArraysContinue;

import java.util.Arrays;

public class Arrays_Sorting {
    public static void main(String[] args) {
        int[] arr1 = {2, 39, 96, 58, 75, 12, 3, 65, 19};
        System.out.println("Before sort" + Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println("After sort: " + Arrays.toString(arr1));

        System.out.println("First maximum number :" + arr1[arr1.length - 1]);
        System.out.println("Second maximum number :" + arr1[arr1.length - 2]);

        System.out.println("First minimum number :" + arr1[0]);
        System.out.println("Second minimum number :" + arr1[1]);

        char[] ch = {'Z', 'D', 'W', 'Y', 'A', 'B', 'D'};
        System.out.println("Before sort: " + Arrays.toString(ch));

        Arrays.sort(ch);
        System.out.println("After sort : " + Arrays.toString(ch));


        String[] names = {"Deniz", "Osman", "Rustem", "Ali", "Anna", "Adil"};
        System.out.println("Before sort: " + Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("After sort : " + Arrays.toString(names));
        System.out.println("===============================================");

        int[] arr = {3, 1, 4, -1, 100, -100, 200, 155};
        System.out.println("Before sort: "+Arrays.toString(arr));
        int[] arrDesc = new int[arr.length];// [0,0,0,0,0,0,0,0]
        Arrays.sort(arr);
        System.out.println("After sort : "+Arrays.toString(arr));
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            //System.out.print(arr[i] + " ");
            arrDesc[j] = arr[i];
            j++;
        }
        System.out.println("Reverse    : "+Arrays.toString(arrDesc));
    }
}
