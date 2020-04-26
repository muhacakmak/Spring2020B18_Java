package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class SplitMethods {
    public static void main(String[] args) {
        String str = "I like Java";

        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        /*
        reverse sentence : day great is today
         */

        String sentence = "Today is great day";

        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));
        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {

            String eachWords = words[i];
            //System.out.print(eachWords+" ");
            result += eachWords + " ";
        }
        System.out.println(result);

        String str2="ABCD";
        String arr2[]=str2.split("");
        char[] ch2=str2.toCharArray();
        System.out.println(Arrays.toString(arr2));


    }
}
