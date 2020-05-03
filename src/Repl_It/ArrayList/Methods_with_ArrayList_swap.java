package Repl_It.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Methods_with_ArrayList_swap {
    public static void main(String[] args) {

        String[] arr = {"a", "c", "b", "d", "e"};

        ArrayList <String> list = new ArrayList <>(Arrays.asList(arr));
        System.out.println(list);
        swap(list,0,3);
        System.out.println(list);



    }

    public static ArrayList <String> swap(ArrayList <String> list, int pos1, int pos2) {
        Collections.swap(list, pos1, pos2);


        return list;
    }

}
