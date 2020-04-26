package Repl_It.Loop;

import java.util.Scanner;

public class _091_Count_Hi_Loop_String {
    /*Print out the number of times that the string "hi" appears anywhere in the given string.

    Example:
    input: abc hi how hi
    output: 2

    Example:
    input: hi code java please
    output: 1
    public static void main(String[] args) {
      */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();//abc hi how hi
        int count = 0;


        while (str.contains("hi")) {

           str = str.replaceFirst("hi", "");
            count++;


        }
        System.out.println(count);


    }
}