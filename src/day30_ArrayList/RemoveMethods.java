package day30_ArrayList;

import java.util.ArrayList;

public class RemoveMethods {
    public static void main(String[] args) {

        ArrayList <Integer> list3 = new ArrayList <>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);

//        int a=3;
//        list3.remove(a);
//        System.out.println(list3);

        Integer a=1;
        list3.remove(a);
        System.out.println(list3);

        ArrayList <Integer> list4 = new ArrayList <>();
        list4.add(10);
        list4.add(20);
        list4.add(30);


        //list4.remove(20); // index out of bound


//        int a3=1;
//        list4.remove(a3;

        Integer a4=100;
        boolean r2=list4.remove(a4);


        Integer a2=20;

        boolean r1=list4.remove(a2);



    }
}
