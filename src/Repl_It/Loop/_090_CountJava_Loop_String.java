package Repl_It.Loop;

import java.util.Scanner;

public class _090_CountJava_Loop_String {
    /*
    Return the number of times that the string "java" appears anywhere in the given string word.
Example:
input: javaxjava
output: 2

Example:
input: javaxjavaapplepearjavaegg
output: 3
     */
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        String word = scan.next().toLowerCase();
        int count=0;

        while (word.contains("java")){
            word=word.replaceFirst("java","");
            count++;
        }
        System.out.println(count);


    }
}
