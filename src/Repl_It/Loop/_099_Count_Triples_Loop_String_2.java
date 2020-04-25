package Repl_It.Loop;

import java.util.Scanner;

public class _099_Count_Triples_Loop_String {
    /*
    We'll say that a "triple" in a string is a char appearing three
    times in a row. Print out the number of triples in the given string.
     The triples may overlap.

Example:
input: abcXXXabc
output: 1

Example:
input: xxxabyyyycd
output: 3

Example:
input: java
output: 0
     */
    public static void main(String[] args) {

        String str = "122abhhh2";//s

        int count=0;
        String result = " ";

        for (int j = 0; j < str.length(); j++) {
            char ch2=str.charAt(j);

            int countLetter=0;
            for (int i = 0; i <str.length() ; i++) {

                char ch=str.charAt(i);
                if(ch==ch2){
                    countLetter++;
                }


            }
            if(countLetter==3){
                result+=ch2;
            }


        }
        for (int i = 0; i <= result.length() - 3; i++) {
            char tree = str.charAt(i);
            if ((tree == str.charAt(i + 1)) && (tree == str.charAt(i + 2))) {
                count++;
            }

        }

        System.out.println(count);



    }

    }



