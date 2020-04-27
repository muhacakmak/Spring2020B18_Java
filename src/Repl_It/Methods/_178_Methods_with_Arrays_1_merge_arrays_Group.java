package Repl_It.Methods;

import java.util.Arrays;

public class _178_Methods_with_Arrays_1_merge_arrays {
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
    public static int[] mergR(int[] a,int[] b){
        int []mergesTwoArray=new int[a.length+b.length];

        for (int i = 0; i <a.length ; i++) {
            mergesTwoArray[i]=a[i];
        }
        for (int i = 0; i <b.length ; i++) {
            mergesTwoArray[i+a.length]=b[i];
        }

        return mergesTwoArray;

    }

    public static void main(String[] args) {

        int []arr1={1,2,3};
        int []arr2={4,5,6};


//        int []mergesR=new int[arr1.length+arr2.length];
//
//        for (int i = 0; i <arr1.length ; i++) {
//            mergesR[i]=arr1[i];
//        }
//        for (int i = 0; i <arr2.length ; i++) {
//            mergesR[i+3]=arr2[i];
//        }
//
//
//        System.out.println(Arrays.toString(mergesR));
        System.out.println(Arrays.toString( mergR(arr1,arr2)));


    }



}
