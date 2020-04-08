package Repl_It;

import java.util.Scanner;

public class _065_MiddleThree_StringMethods {
    /*
            You have a word, do the following:

            If the word has odd number of characters
            and has 5 or more characters, print the middle three
            characters of the word.

            Otherwise print "invalid".

            fifteen ==> fte
            apple ==> ppl
            hey ==> invalid
            java ==> invalid
            whatsup ==> ats
            $ ==> invalid

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String result="";

        if(5<=word.length() &&word.length()%2!=0) {

           result=word.substring(word.length() / 2 - 1, word.length() / 2 + 2);

        }else{
            result="invalid";
        }
        System.out.println(result);
    }
}
