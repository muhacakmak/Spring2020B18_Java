package day22_Arrays_Loops.WarmUp;

import java.util.Arrays;

public class Descending {
    /*
            2. write a program that sort the array in descending order

     */
    public static void main(String[] args) {

        int []arr={10,78,2-1,500,70};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        int []revArr=new int[arr.length];
        int j=arr.length-1;
        for (int i = 0; i <arr.length ; i++) {

            revArr[i]=arr[j];
            j--;

        }
        System.out.println(Arrays.toString(revArr));


    }
}
