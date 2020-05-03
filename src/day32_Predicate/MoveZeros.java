package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeros {
    /*
     Write a program that can move all the zeros to  last indexes of ArrayList
        Ex:
            list:  {1,0,2,0,3,0,4,0};
            output: [1, 2, 3, 4, 0, 0, 0, 0]
            DO NOT USE SORT method, DO NOT decleare  any extra lists

     */
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList <>(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));
        System.out.println("Original list : "+list);

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)==0){
                count++;
            }
        }
        System.out.println("Count of zero : "+count);
        Integer zero=0;
        list.removeAll(Arrays.asList(zero));
        System.out.println("After remove zero :"+list);

        for (int i = 0; i <count ; i++) {
            list.add(0);
        }

        System.out.println("After add Zero end: "+list);









    }
}
