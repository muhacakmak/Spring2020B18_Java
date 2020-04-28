package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Practice2 {
    /*
       1-create a list of Integer
       2- add 5 Integer to it
       3- return the maximum number from the list
        */
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList <>();
        list.add(100);
        list.add(20);
        list.add(300);
        list.add(400);
        list.add(50);
        list.add(700);
        list.add(800);
        ArrayList <Integer> list2 = new ArrayList <>();
        list2.add(100);
        list2.add(200);
        list2.add(300);
        int maximum3=max(list2);

        System.out.println(maximum3);

    }

    public static int max(ArrayList <Integer> list) {
        int maximum = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > maximum) {
                maximum = list.get(i);
            }
        }
        return maximum;
    }
}
