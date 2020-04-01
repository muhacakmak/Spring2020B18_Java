package Repl_It;

import java.util.Scanner;
/*
    in this assignment you are given two string variables word1 and word2.
    you need to check if they are equal using an if.
    Comparison should be case sensitive. "java" and "JaVa" are not equal.
    if they are equal output  "word1 equals word2"
    else output "word1 does not equal word2"
 */

public class _035_Words {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("word1=");
        String word1=s.next();
        System.out.print("word2=");
        String word2=s.next();

        if (word1.equals(word2)){
            System.out.println("word1 equals word2");
        }else {
            System.out.println("word1 does not equal word2");
        }

    }
}
