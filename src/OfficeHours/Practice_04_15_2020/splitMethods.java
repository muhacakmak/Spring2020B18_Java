package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class splitMethods {
    public static void main(String[] args) {


        String sentence="I like to learn java";
        String [] words=sentence.split(" ");
        System.out.println(Arrays.toString(words));
        int totalWords=words.length;
        System.out.println(totalWords);
        String result="";

        for (int i = words.length-1; i >=0 ; i--) {

            result+=words[i]+" ";





        }
        System.out.print(result.trim());



    }
}
