package Repl_It.EachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class _106_Arrays_SplitSentence_Loop_String {
    /*
    Given a String variable sentence, write code to type each word in separate lines.
        Example:
        sentence -> "Java is fun"
        Print
        Java
        is
        fun
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String[] words=sentence.split(" ");

        for (String eachWord:words){

            System.out.println(eachWord);


        }




    }
}
