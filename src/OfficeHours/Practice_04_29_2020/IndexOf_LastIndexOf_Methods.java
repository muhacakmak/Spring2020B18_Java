package OfficeHours.Practice_04_29_2020;

import java.util.ArrayList;

public class IndexOf_LastIndexOf_Methods {

    public static void main(String[] args) {
        ArrayList<Character> list1=new ArrayList <>();

        list1.add('A');
        list1.add('B');
        list1.add('C');
        list1.add('D');
        list1.add('C');

        list1.indexOf('C');

        int indexNum=list1.indexOf('C');
        System.out.println(indexNum);
        int lastIndexNum=list1.lastIndexOf('C');
        System.out.println(indexNum);
        System.out.println(lastIndexNum);
        System.out.println(list1);
        Character ch1='C';
        //list1.remove(ch1);
        list1.remove(list1.lastIndexOf('C'));
        System.out.println(list1);





    }
}
