package Repl_It;

import java.util.Scanner;

public class _060_VerifyContains_StringMethods {
    /*
    Write a program that will verify if word contains in the sentence.
    Print out the result as boolean value.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter sentence :");
        String sentence = scan.nextLine();
        String word = scan.nextLine();
        System.out.print("enter word :");

        boolean r1=  sentence.contains(word);
        System.out.println(r1);






    }
}
