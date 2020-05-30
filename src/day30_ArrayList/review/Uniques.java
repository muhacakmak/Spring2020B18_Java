package day30_ArrayList.review;

import java.util.ArrayList;

public class Uniques {
    /*
    3.  write a program that can find the uniqueWithLoop elements from an
    ArrayList of integers and stores into another list called uniques
            Task.Pizza: list==> {1,1,2,3,3,4,5}
                uniques ==> {2,4,5}
     */
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList <>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(2);
        list.add(5);
        System.out.println(list);

        ArrayList <Integer> uniques = new ArrayList <>();
        for (Integer each2:list) {
            int count = 0;
            for (Integer each : list) {
                if(each==each2){
                    count++;
                }
            }
            if(count==1){
            uniques.add(each2);
            }
        }
        System.out.println(uniques);





    }
}
