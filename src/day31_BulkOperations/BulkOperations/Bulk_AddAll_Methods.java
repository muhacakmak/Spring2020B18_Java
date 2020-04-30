package day31_BulkOperations.BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_AddAll_Methods {
    public static void main(String[] args) {

        ArrayList <Integer> list1 = new ArrayList <>();
        /*
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        */
        //list1.addAll(Arrays.asList(30,20,40,50,45,35,200)

        Integer []arr1={30,20,40,50,45,35,200};
        list1.addAll(Arrays.asList(arr1));
        System.out.println(list1);

        System.out.println("=============================");
        String []names={"Selcuk","Elif","Emir","Namik","Tahir"};
        //                0        1      2       3       4
        //names[5]="Osman";
        System.out.println(Arrays.toString(names));
        ArrayList<String>nameList=new ArrayList <>();
        nameList.addAll(Arrays.asList(names));
        System.out.println(nameList);
        nameList.add("Osman");

        System.out.println(nameList);
        nameList.remove("Osman");
        System.out.println(nameList);

        Integer []numbers={1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer>numList=new ArrayList <>(Arrays.asList(numbers));
        System.out.println(numList);




    }
}
