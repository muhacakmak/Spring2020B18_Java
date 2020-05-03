package day31_BulkOperations.Review;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_AddAll {
    public static void main(String[] args) {


        ArrayList <Integer> list1 = new ArrayList <>();
        // add 30,20,40,50,45,35,200
       /*
        list1.add(30);
        list1.add(20);
        list1.add(40);
        list1.add(50);
        list1.add(45);
        list1.add(35);
        list1.add(200);
        */
        //list1.addAll(Arrays.asList(30, 20, 40, 50, 45, 35, 200));

        Integer[] arr1 = {30, 20, 40, 50, 45, 35, 200};// Array list does not support primitive
        list1.addAll(Arrays.asList(arr1));

        System.out.println(list1);

        System.out.println("========================================================");

        String[] names = {"Selcuk", "Elif", "Ali", "Veli"};

        ArrayList <String> nameList = new ArrayList <>();
        nameList.addAll(Arrays.asList(names));
        nameList.add("Tahir");
        // nameList.remove("Veli");

        nameList.removeAll(Arrays.asList("Ali", "Veli"));

        System.out.println(nameList);


        System.out.println("====================================");

        Integer []numbers={1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> numList=new ArrayList <>(Arrays.asList(numbers));

        System.out.println(numList);


    }
}
