package Repl_It.Methods;

import java.util.Arrays;

public class _178_Methods_with_Arrays_1_merge_arrays_Group {
    /*
    mergR merges two arrays into one.
        it gets two int arrays and returns an int array

        for example:

        mergR([1,2,3],[4,5,6])
        returns [1,2,3,4,5,6]

        mergR([1,2],[6,8])
        returns [1,2,6,8]

        hint:
        create a length int for the combined length of both arrays.
        create an array with that length (thats the array we will return).
        create an iterator for both arrays (int z=0).

        loop first array and inside the loop insert current element to the return array (ret[z]=a[i];)
        then increment the iterator for both arrays (z++).

        do the same for the second array.

     */


    public static void main(String[] args) {
//                    0  1  2
        int[] arr1 = {1, 2, 3};//3
        int[] arr2 = {4, 5, 6, 7};
        mergR(arr1,arr2);

    }
    public static int[] mergR(int[] a,int[] b) {
        int[] mergeArr = new int[a.length + b.length];
        int k = 0;
        for (int eacNumber : a) {
            mergeArr[k] = eacNumber;
            k++;
        }
        int h = a.length;
        for (int eacNumber2 : b) {
            mergeArr[h]=eacNumber2;
            h++;
        }
        System.out.println(Arrays.toString(mergeArr));
        return mergeArr;
    }

}
