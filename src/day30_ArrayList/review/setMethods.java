package day30_ArrayList.review;

import java.util.ArrayList;

public class setMethods {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};//
        arr[3] = 5;


        ArrayList <Integer> list1 = new ArrayList <>();
        list1.add(5);
        list1.add(7);
        list1.add(8);
        list1.add(1, 6);

        System.out.println(list1);

        list1.set(3, 9);

        System.out.println(list1);
        ArrayList <String> list2 = new ArrayList <>();
        list2.add("A");
        list2.add("B");
        list2.add(1,"C");
        list2.add(1,"D");
        System.out.println(list2);

        list2.set(3,"F");
        list2.set(2,"E");

        System.out.println(list2);// {A,D,E,F}




    }
}
