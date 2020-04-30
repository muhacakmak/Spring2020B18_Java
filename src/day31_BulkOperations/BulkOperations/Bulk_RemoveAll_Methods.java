package day31_BulkOperations.BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_RemoveAll_Methods {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList <>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 1));
        Integer a = 1;
//        list.remove(a);
//        list.remove(a);
        list.removeAll(Arrays.asList(a));
        System.out.println(list);


        System.out.println("=================================");
        String []names={"Ahmed","John","Aaron","Ahmed", "Daniel"};
        ArrayList<String>namesList=new ArrayList <>(Arrays.asList(names));
        System.out.println(namesList);
        namesList.removeAll(Arrays.asList("Ahmed"));
        System.out.println(namesList);








    }
}
