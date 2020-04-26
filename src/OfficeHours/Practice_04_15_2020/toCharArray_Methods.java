package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class toCharArray_Methods {
    public static void main(String[] args) {
        String str = "Cybertek";


        char[] ch1 = str.toCharArray();
        System.out.println(ch1.length == str.length());

        /*
        str1="abc", str2="cab"
         */
        String str1 = "ABCD";
        String str2 = "BAC";

        char chStr1[] = str1.toCharArray();
        System.out.println("Before sort");
        System.out.println(Arrays.toString(chStr1));
        char chStr2[] = str2.toCharArray();
        System.out.println(Arrays.toString(chStr2));
        System.out.println(Arrays.equals(chStr1,chStr2));

        Arrays.sort(chStr1);
        Arrays.sort(chStr2);
        System.out.println(Arrays.toString(chStr1));
        System.out.println(Arrays.toString(chStr2));


        System.out.println(Arrays.equals(chStr1,chStr2));


    }
}
