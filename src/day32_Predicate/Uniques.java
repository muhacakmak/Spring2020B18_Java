package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uniques {
    /*
    write a program that can return the unique objects from arraylist of characters
     */
    public static void main(String[] args) {
        ArrayList <Character> list = new ArrayList <>(Arrays.asList('A', 'A', 'B', 'C', 'D', 'D'));
        ArrayList <Character> result = new ArrayList <>(Arrays.asList());
        System.out.println("Original list: " + list);
/*
        for (int i = 0; i <list.size() ; i++) {
            int count= Collections.frequency(list,list.get(i));
            if(count==1){
                result.add(list.get(i));
            }
        }

 */
        for (Character each:list) {
            int count= Collections.frequency(list,each);
            if(count==1){
                result.add(each);
            }
        }
        System.out.println(result);

    }
}
