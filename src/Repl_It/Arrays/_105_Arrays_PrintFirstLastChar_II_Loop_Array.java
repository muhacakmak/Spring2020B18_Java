package Repl_It.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _105_Arrays_PrintFirstLastChar_II_Loop_Array {
    /*
   Given a String array words, iterate through each word and print first and last letter of each element in the format below.

        Example:

        words → ["hello", "why", "by", "apple" , "note"]
        print → [ho, wy, by, ae, ne]


     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String result="";



        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        for (String eachWord:words){

            result+=eachWord.substring(0,1)+eachWord.substring(eachWord.length()-1)+" ";


        }
        result=result.trim();
        String [] resultArr=result.split(" ");
        System.out.println(Arrays.toString(resultArr));





    }
}
