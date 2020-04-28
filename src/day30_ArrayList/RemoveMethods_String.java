package day30_ArrayList;

import java.util.ArrayList;

public class RemoveMethods_String {
    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList <>();
        list.add("A");
        list.add("B");
        list.add("C");


        //list.remove(1);

        String str="F";

        boolean r=list.remove(str);

        boolean r1=list.remove("A");

        System.out.println(list);
        System.out.println(r1);




    }
}
