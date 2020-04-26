package day20_ArraysContinue;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String myName = "Selcuk";
        char[] characters = myName.toCharArray();
        System.out.println(Arrays.toString(characters));

        String str1 = "Cybertek School";

        String str2 = "School Cybertek";
        char[] ch1 = str1.toCharArray();//[C, y, b, e, r, t, e, k,  , S, c, h, o, o, l]
        char[] ch2 = str2.toCharArray();//[S, c, h, o, o, l,  , C, y, b, e, r, t, e, k]
        System.out.println("Before sort");
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
        System.out.println("Two array equal or not : "+Arrays.equals(ch1, ch2));
        System.out.println("After sort");
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
        System.out.println("Two array equal or not : "+Arrays.equals(ch1, ch2));
    }
}
