package day29_Wrapper_ArrayList.ArrayListReview;

import java.util.ArrayList;

public class task1_Max_MinNumber {
     /*
        1- create a list of Integers
        2- add 5 Integers to it
        3- return the maximum number from the list
         */
     public static void main(String[] args) {
         ArrayList<Integer>list=new ArrayList <>();
         list.add(100);
         list.add(20);
         list.add(300);
         list.add(400);
         list.add(50);

         System.out.println(list.size());
         int max=Integer.MIN_VALUE;
         for (int i = 0; i <list.size() ; i++) {
             if(list.get(i)>max){
                 max=list.get(i);
             }
         }
         System.out.println(max);

         for (Integer each:list) {
             if(each>max){
                 max=each;
             }
         }
         System.out.println(max);
     }
}
