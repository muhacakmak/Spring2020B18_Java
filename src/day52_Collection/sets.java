package day52_Collection;

import java.util.*;

public class sets {
    public static void main(String[] args) {

        Set <String> names = new HashSet <>();
       // Set <String> names = new linkedHashSet <>();
        names.add("Sha");
        names.add("Zuura");
        names.add("Saban");
        names.add("Ozgur");
        names.add("Ozgur");
        names.add("Ozgur");
        names.add("Ozgur");
        System.out.println(names);

        String[]arr={"A", "A","C","B","A"};//

        LinkedHashSet<String>set1=new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(set1);
        //System.out.println(set1.get(1));no index
        System.out.println("==================================");
        Set<Integer>numbers=new TreeSet <>();

        numbers.addAll(Arrays.asList(10,9,10,9,8,7,8,76,5,6));
        System.out.println(numbers);

        System.out.println("==================================");
        HashSet<String>hashSet=new HashSet <>();
        hashSet.add(null);
        System.out.println(hashSet);
        System.out.println("==================================");
        String number="123";
        int num1=Integer.parseInt(number);
        System.out.println(num1);
        System.out.println("==================================");
        String []arr1={null,"Cybertek","ABC"};
        arr1[2].toUpperCase();
        String name1="cybertek".toUpperCase();
        System.out.println(name1);




    }
}
