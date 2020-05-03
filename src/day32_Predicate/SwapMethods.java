package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapMethods {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList <>(Arrays.asList(1,2,3,4,5));// {1,2,3,4,5}
        //                                                                    0 1 2 3 4
        System.out.println("Original list: "+list);


        Collections.swap(list,0,4);

        System.out.println("After swap 1 and 5 :"+list);









    }
}
