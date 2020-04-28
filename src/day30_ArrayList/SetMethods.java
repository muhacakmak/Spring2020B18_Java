package day30_ArrayList;

import java.util.ArrayList;

public class SetMethods {
    public static void main(String[] args) {

        ArrayList <Integer> list1 = new ArrayList <>();
        list1.add(5);//0
        list1.add(7);//1
        list1.add(8);//2

        list1.add(1,6);// {5,6,7,8}

        list1.set(3,9);

        ArrayList <String> list2 = new ArrayList <>();

        list2.add("A");
        list2.add("B");

        list2.add(1,"C");
        list2.add(1,"D");

        list2.set(2,"E");
        list2.set(3,"F");






        System.out.println(list2);


        



        System.out.println(list1);


    }
}
