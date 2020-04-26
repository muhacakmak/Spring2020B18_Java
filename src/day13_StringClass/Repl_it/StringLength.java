package day13_StringClass.Repl_it;

import java.util.Scanner;

public class StringLength {
    /*
      ask the user for his name, capture it on a string using scanner.

      then output the length of the name string.
     */
    public static void main(String[] args) {
                name();


    }
    public static void name(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=input.nextLine();
        //           012345
        int length=name.length();
        System.out.println(length);


    }
}
