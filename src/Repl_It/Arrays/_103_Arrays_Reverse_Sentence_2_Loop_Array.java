package Repl_It.Arrays;

import java.util.Scanner;

public class _103_Arrays_Reverse_Sentence_2_Loop_Array {
    /*
    Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.
        Example:
        sentence -> "Java is fun"
        reversed -> "fun is Java"
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();;

        String reversed = "";
        String []arrSentences=sentence.split(" ");

        for (int i = arrSentences.length-1; i >=0 ; i--) {
            reversed+=arrSentences[i]+" ";

        }
        reversed=reversed.substring(0,reversed.length()-1);
        System.out.println(reversed);
        }


    }

