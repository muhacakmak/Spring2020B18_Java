package day53_Iteratir_Maps;

import java.util.*;

public class Collection_Practice {
    /*
      access-modifiers  specifier  return-type  methodsName(Parameter)
          specifiers: static, final, abstract, synchronized
       */
    public static void main(String[] args) {

        List <Integer> list = new ArrayList <>(Arrays.asList(1, 2, 3, 4, 5));
        list = Collections.synchronizedList(list);// thread-safe

        Set <Integer> set = new HashSet <>();
        set = Collections.synchronizedSet(set);

        System.out.println("==================================");

        //    1. write a program that remove the duplicates fron an array of String
        String[] arr = {"E", "B", "A", "D", "D", "C", "A"};//EDADC

        LinkedHashSet <String> st = new LinkedHashSet <>(Arrays.asList(arr));
        System.out.println(st);
/*
        for (String each:arr) {
            st.add(each);
        }

        System.out.println(st);
 */


        ArrayList <String> arrayList = new ArrayList <>(Arrays.asList("E", "B", "A", "D", "D", "C", "A"));
        LinkedHashSet <String> st2 = new LinkedHashSet <>(arrayList);



    }


    public synchronized void append() {

    }
}
