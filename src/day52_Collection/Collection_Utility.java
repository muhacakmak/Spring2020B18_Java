package day52_Collection;

import java.util.*;

public class Collection_Utility {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList <>();
        list1.addAll(Arrays.asList(10,9,8,7,6,5,4));
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
        System.out.println("============================");
        //1. write q progrqm that can remove the duplication and printbout in
        //sorted order
        ArrayList<Integer>nums=new ArrayList <>(Arrays.asList(1,2,3,4,4,6,7,7,4,3,2,2,1,1));

        nums=new ArrayList <>(  new TreeSet <>(nums));

        System.out.println(nums);
        System.out.println("=================================");
        // write program that can removed the duplication from an arrayList.do not change the order
        ArrayList<Integer>list=new ArrayList <>(Arrays.asList(6,6,6,6,5,5,4,4,4,4));
        list=new ArrayList <>(new LinkedHashSet <>(list));
        System.out.println(list);
        System.out.println("========================================");
        ArrayList<String>letters=new ArrayList <>();
        letters.addAll(Arrays.asList("A","A","B","C","B","D"));
        boolean result=Collections.frequency(letters,"A")==1;
        System.out.println(result);





    }
}
