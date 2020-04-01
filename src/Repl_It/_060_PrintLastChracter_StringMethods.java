package Repl_It;

import java.util.Scanner;

public class _060_PrintLastChracter_StringMethods {
    /*
    Write a program that will print out last letter of the word (string).

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        char ch=word.charAt(word.length()-1);
        System.out.println(ch);


    }
}
