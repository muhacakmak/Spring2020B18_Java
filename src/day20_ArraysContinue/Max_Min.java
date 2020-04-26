package day20_ArraysContinue;

import java.util.Random;

public class Max_Min {
    /*
      1. write a program that can find the maximum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE CLASS
    2. write a program that can find the minimum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE CLASS
     */
    public static void main(String[] args) {


        int[] arr = {10, 6, 1, 200, 6, 7, 8, 1000};

        int max=arr[0];
        int min=arr[0];

        for (int i = 0; i <=arr.length -1; i++) {
            if(arr[i]>=max){//array's index are copared with each other
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
   }
        System.out.println("Maximum number in this array: "+max);
        System.out.println("Minimum number in this array: "+min);

        System.out.println(arr.length);

    }
}
