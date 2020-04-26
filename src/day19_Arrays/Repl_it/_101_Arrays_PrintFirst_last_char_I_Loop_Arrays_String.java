package day19_Arrays.Repl_it;

import java.util.Scanner;

public class _101_Arrays_PrintFirst_last_char_I_Loop_Arrays_String {
    /*
    Given a String array words, iterate through each word and print first and last
    letter of each element in separate lines.
    Example:
    words → ["hello", "why", "by", "apple" , "note"]
    print:
           ho
           wy
           by
           ae
           ne
     */

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        //                0       1    2    3       4
        String []words={"hello","why","by","apple","note"};
//                       01234

String firstAndLastLetter="hello";




//        for (String eachWord:words) {
//            firstAndLastLetter=eachWord.substring(0,1)+eachWord.substring(eachWord.length()-1);
//            System.out.println(firstAndLastLetter);
//
//
//        }
//                            5
        for (int i = 0; i <words.length; i++) {

            String eachWord=words[i];
            firstAndLastLetter+=eachWord.substring(0,1)+eachWord.substring(eachWord.length()-1);

            System.out.println(firstAndLastLetter);
        }






    }
}
