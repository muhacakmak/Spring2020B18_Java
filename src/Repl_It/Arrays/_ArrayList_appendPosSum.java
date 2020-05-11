package Repl_It.Arrays;

import java.util.ArrayList;

public class _ArrayList_appendPosSum {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList <>();
        list.add(2);
        list.add(-5);
        list.add(3);
        list.add(-2);
        list.add(5);
        list.add(-4);
        list.add(2);
        list.add(-9);
        System.out.println(list);
        ArrayList <Integer> newArrList = new ArrayList <>();
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0) {
                sum += list.get(i);
                newArrList.add(list.get(i));
            }
        }
        newArrList.add(sum);
        newArrList.add(5);


        System.out.println(newArrList);

        System.out.println(sum);

    }

    public static ArrayList <Integer> appendPosSum(ArrayList <Integer> list) {
        ArrayList <Integer> newArrList = new ArrayList <>();
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0) {
                sum += list.get(i);
                newArrList.add(list.get(i));
            }
        }
        newArrList.add(sum);


        return newArrList;
    }
}
