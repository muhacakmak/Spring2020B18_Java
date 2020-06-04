package OfficeHours.fficeHours.Practice_06_03_2020;

import java.util.ArrayList;

/*
1) Create a method that will accept an int array and return the sum of all the numbers in the given array


 */
public class Task1 {
    public static void main(String[] args) {
        int arr[]={1,2,5};
        System.out.println(sum(arr));

    }
    public static int sum(int [] arr){
        int sum=0;
        for (int each : arr) {
            sum += each;
        }
        return sum;
    }
    public static int sum(ArrayList<Integer>list){
        int sum=0;
        for (Integer each : list) {
            sum += each;
        }
        return sum;
    }


}
