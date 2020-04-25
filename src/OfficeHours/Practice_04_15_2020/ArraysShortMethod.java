package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class ArraysUtility {

    /*
    Arrays.shot();sort the array in Ascending order
    Arrays.equal;
    Arrays.toString();
    Arrays.deepToString();
     */
    public static void main(String[] args) {

        //  Arrays.shot();sort the array in Ascending order


        int[]arr={9,10,8,65,8,6,5};
        System.out.println("Before sort: "+Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("After sort : "+Arrays.toString(arr));

        int [] salaries={10000,200000,30,50000,532,12123,2000000};

        Arrays.sort(salaries);
        int length=salaries.length;

        System.out.println(Arrays.toString(salaries));
//        int lastIndex=length-1;
//        int firstIndex=salaries[0];

        System.out.println("Minimum Salary: "+salaries[0]);
        System.out.println("Maximum Salary: "+salaries[salaries.length-1]);




    }
}
