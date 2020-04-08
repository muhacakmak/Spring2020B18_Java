package Repl_It;

import java.util.Scanner;

public class _087_Has_a_Java_Loop_String {
    /*
    Given a string word, print true if "java" appears starting at index 0 or 1 in the string,
    such as with "javaxxx" or "xjavaxx" but not "xxjavaxx".
    The string may be any length, including 0word = .
                Example:
                input: javapython
                output: true
                Example:
                input: cjavac++
                output: true
                Example:
                input: c#javaruby
                output: false
     */
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next().toLowerCase();

//        if(word.length()>=4) {
//            exists = word.startsWith("java") || word.substring(1, 5).equalsIgnoreCase("java");
//
//            if (exists) {
//                System.out.println(true);
//            } else {
//                System.out.println(false);
//            }
//        }else {
//            System.out.println(false);
//        }

        if (0 == word.indexOf("java", 0) || 1 == word.indexOf("java", 1)) {
            exists = true;
        }
        System.out.println(exists);
    }
}


