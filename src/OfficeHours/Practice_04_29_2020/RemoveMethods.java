package OfficeHours.Practice_04_29_2020;

import java.util.ArrayList;

public class RemoveMethods {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList <>();
        list.add(10);
        list.add(20);
        list.add(2,30);


        System.out.println(list);
        System.out.println(list.size());



        ArrayList<String>list2=new ArrayList <>();
        list2.add("A");
        list2.add("B");
        list2.add("E");
        list2.add("D");//   A,B,E,C,D
        //list2:{A, B, E,D}// remove A
        boolean r1=list2.remove("A");
        System.out.println(list2);
        System.out.println(r1);

        boolean r2=list2.remove("Z");
        System.out.println(r2);

        System.out.println(list2.size());

        System.out.println("==============================");
        ArrayList<Integer>num=new ArrayList <>();
        num.add(6);
        num.add(2);
        num.add(3);
        num.add(1);
        num.add(9);
        num.add(2);
        num.add(5);
        System.out.println(num);

        num.remove(1);

        System.out.println(num);
        Integer a=3;

        num.remove(a);
        System.out.println(num);









    }
}
