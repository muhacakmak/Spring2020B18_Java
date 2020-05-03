package day31_BulkOperations.Review;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_RemoveAll {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList <>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 1, 3));
        // remove 1,3,5,8


        //Integer a=3;
//        list.remove(a);
//        list.remove(a);
        //  list.removeAll(Arrays.asList(3,1,5,8));
        Integer[] arr = {3, 1, 5, 8};
        list.removeAll(Arrays.asList(arr));

        System.out.println(list);
        System.out.println("============================================");
        String []names={"Ahmed","Ahmed","Emir","Tahir","Elif","Veli"};
        ArrayList<String>namesList=new ArrayList <>(Arrays.asList(names));
        System.out.println(namesList);

        namesList.removeAll(Arrays.asList("Ahmed","Veli"));
        System.out.println(namesList);

    }
}
