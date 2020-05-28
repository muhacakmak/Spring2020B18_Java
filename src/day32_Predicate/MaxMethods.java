package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MaxMethods {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList <>(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));
        int max = Collections.max(list);
//        System.out.println(max);
//        int min=Collections.min(list);
//        System.out.println(min);
        /*
        1. write a program that can return the second maximum from ArrayList
        Pizza={1,2,3,4,5,6,7,8,8}
        output :7
         1. write a program that can return the second minimum from ArrayList
         output:2
         */
        ArrayList <Integer> numbers = new ArrayList <>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 8));
        System.out.println("Original array list: " + numbers);

        Integer firstMax = Collections.max(numbers);
        System.out.println("Seljuk number: " + firstMax);
        numbers.removeAll(Arrays.asList(firstMax));
        Integer secondMaxNumber = Collections.max(numbers);
        System.out.println("Second MaxNumber: " + secondMaxNumber);

        Integer firstMin = Collections.min(numbers);
        System.out.println("Min number: " + firstMin);
        numbers.removeAll(Arrays.asList(firstMin));
        Integer secondMinNumber = Collections.min(numbers);
        System.out.println("Second MinNumber: " + secondMinNumber);


    }
}
