package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class EqualsMethods {
    public static void main(String[] args) {
        ArrayList <String> list1 = new ArrayList <>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");


        ArrayList <String> list2 = new ArrayList <>();
        list2.add("A");
        list2.add("D");
        list2.add("C");
        list2.add("B");
        Collections.sort(list1);
        Collections.sort(list2);


        boolean r2 = list1.equals(list2);
        System.out.println(r2);
        System.out.println("======================================");
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {3, 2, 1};
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean r3 = Arrays.equals(arr1, arr2);
        System.out.println(r3);

        System.out.println("======================================");
        ArrayList <Integer> list3 = new ArrayList <>();

        list3.add(10);
        list3.add(100);
        list3.add(1000);
        list3.add(20);

        Collections.sort(list3);

//        int k = list3.size()-1;
//        for (Integer each : list3) {
//
//            each=list3.get(k);
//            k--;
//
//            System.out.print(each+",");
//
//        }
        ArrayList <Integer> reversedList3 = new ArrayList <>();


        for (int i = list3.size()-1; i >=0 ; i--) {
           // System.out.print(list3.get(i)+" ");
            reversedList3.add(list3.get(i));

        }
        System.out.println(reversedList3);
        System.out.println(list3);

    }
}
