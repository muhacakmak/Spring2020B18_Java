package OfficeHours.Practice_04_29_2020;

import java.util.ArrayList;

public class GetMethods {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList <>();
        list.add(10);
        list.add(20);
        list.add(2, 30);


        System.out.println(list);
        System.out.println(list.size());

        int num1 = list.get(2);// Integer 20, unboxing

        byte a = 10;
       //  Integer b = a;
        Byte a2 = 100;
        int b2 = a2;

        ArrayList<String>list2=new ArrayList <>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");//   A,B,E,C,D

        list2.add(2,"E");

        System.out.println(list2);


        for (int i = 0; i <list2.size() ; i++) {
            String str=list2.get(i);
            System.out.println(str);
        }

        System.out.println("====================");

        for (String each:list2) {
            System.out.println(each);

        }



    }
}
