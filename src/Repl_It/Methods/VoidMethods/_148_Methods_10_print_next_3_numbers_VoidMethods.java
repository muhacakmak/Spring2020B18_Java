package Repl_It.Methods.VoidMethods;

import java.util.Scanner;

public class _148_Methods_10_print_next_3_numbers_VoidMethods {
    /*
 Create a method called next3 . This method gets an int argument and
 prints the next 3 numbers after that number.
 Call the method from main method and pass num to it.

        enter number
        1
        next 3 are:
        2 3 4
     */
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        System.out.print("enter number ");
        int num = inp.nextInt();
        next3(num);



    }
    public static void next3(int num){
        System.out.println((num+1)+" "+(num+2)+" "+(num+3));
    }


}
