package day30_ArrayList;

import java.util.ArrayList;

public class IndexofMethods {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList <>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);

        int num1 = list.indexOf(1);
        System.out.println(num1);

        int num2 = list.indexOf(100);
        System.out.println(num2);


        int num3 = list.indexOf(3);
        System.out.println(num3);


    }
}
