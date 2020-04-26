package Repl_It.Methods.VoidMethods;

import java.util.Scanner;

public class _141_Methods_3_Find_Cube_VoidMethods {

//Given method called cube. Write all required code inside this method in order  to asks the user for a number and then prints the cubed value of that number:
//
//Example:
//
//input: 5
//output: 125

    public static void main(String[] args) {
        cube();





    }

    public static void cube(){
        Scanner scan =new Scanner(System.in);
        int number=scan.nextInt();

        int output=number*number*number;
        System.out.println(output);



    }

}
