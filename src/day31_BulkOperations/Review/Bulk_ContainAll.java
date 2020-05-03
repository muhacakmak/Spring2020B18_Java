package day31_BulkOperations.Review;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_ContainAll {
    public static void main(String[] args) {

        ArrayList<Integer> list1=new ArrayList <>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        // if 10 20 and 60 all objects are exit in array list== true
        // otherwise false
        boolean r1=list1.contains(10);
        boolean r2=list1.contains(20);
        boolean r3=list1.contains(60);
        boolean result=r1&&r2&&r3;
        System.out.println(result);
        boolean n=list1.containsAll(Arrays.asList(20,10,40));
        System.out.println(n);
        ArrayList<Integer> list2=new ArrayList <>(Arrays.asList(10,20,30,52));
        System.out.println(list2);


        Integer[] date={10,20,30};
        boolean n2=list1.containsAll(Arrays.asList(date));
        System.out.println(n2);

        ArrayList<Integer> list3=new ArrayList <>(Arrays.asList(date));




    }
}
