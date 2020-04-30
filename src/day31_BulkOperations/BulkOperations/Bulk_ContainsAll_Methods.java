package day31_BulkOperations.BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_ContainsAll_Methods {
    public static void main(String[] args) {

        ArrayList <Integer> list1 = new ArrayList <>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        // if 10,20,60,90, 100, 200, 300 if all objects exits in arrayList ==>true
        // otherwise ==>false
     /*
        boolean r1 = list1.contains(10);
        boolean r2 = list1.contains(20);
        boolean r3 = list1.contains(60);
        boolean result = r1 == true && r2 == true && r3 == true;
        System.out.println(result);
      */
//        ArrayList <Integer> list2 = new ArrayList <>();
//        list2.add(10);
//        list2.add(20);
//        boolean result3=list1.containsAll(list2);






        boolean result2=list1.containsAll(Arrays.asList(20,10));

        System.out.println(result2);

        Integer []date={10,30,40};
        boolean result3=list1.containsAll(Arrays.asList(date));
        System.out.println(result3);


    }
}
