package OfficeHours.Practice_04_29_2020;

import java.util.ArrayList;

public class CompaningTwoArray {
    public static void main(String[] args) {

        int[] arr1={10,2,3,4,5};
        int []arr2={6,7,8,9,10,11,12,13};
        ArrayList<Integer>list=new ArrayList <>();
        for (int i = 0; i <arr1.length ; i++) {
            list.add(arr1[i]);
        }
        System.out.println(list);
        for (int each:arr2) {
            list.add(each);
        }
        System.out.println(list);
    }
}
