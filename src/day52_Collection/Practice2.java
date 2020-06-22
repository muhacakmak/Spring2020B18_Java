package day52_Collection;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
Tasks:

 2. write a program that can identify if two strings are build out of the same letters
        ex:
            str1 = "abababa"
            str2 ="ab";
            output: true

 */
public class Practice2 {
    public static void main(String[] args) {
        /*
        String str1 = "abababa";
        String str2 = "abab";
        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");

        TreeSet <String> treeSet1 = new TreeSet <>(Arrays.asList(arr1));
        TreeSet <String> treeSet2 = new TreeSet <>(Arrays.asList(arr2));
        System.out.println(treeSet1);
        System.out.println(treeSet2);

        str1=treeSet1.toString();
        str2=treeSet2.toString();

        System.out.println(str1.equals(str2));
        */

        String str1 = "abababa";
        String str2 = "abab";
        str1 = new TreeSet <>(Arrays.asList(str1.split(""))).toString();
        str2 = new TreeSet <>(Arrays.asList(str2.split(""))).toString();
        System.out.println(str1.equals(str2));


    }
}
