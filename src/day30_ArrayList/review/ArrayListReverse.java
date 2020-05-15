package day30_ArrayList.review;

import java.util.ArrayList;

public class ArrayListReverse {
    /*
     2. write a program that can print the list of integers in reversed order
        Pizza:
            list=> {1,2,3,4,5}
            output: 5 4 3 2 1
     */
    public static void main(String[] args) {


        ArrayList<Integer>list=new ArrayList <>();
        for (int i = 1; i <6 ; i++) {
            list.add(i);

        }
        System.out.println(list);


        ArrayList<Integer>listReverse=new ArrayList <>();
        for (int i = list.size()-1; i >=0 ; i--) {

            listReverse.add(list.get(i));


        }
        System.out.println(listReverse);






    }
}
