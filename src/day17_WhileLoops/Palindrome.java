package day17_WhileLoops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        String str=input.nextLine();

        String reversedStr="";

        int index=str.length()-1;


        while (index>=0){

            reversedStr+=str.charAt(index);
            index--;


        }
        System.out.println(reversedStr);

       boolean palindrome= str.equalsIgnoreCase(reversedStr);
        System.out.println(str+ " "+palindrome);

    }
}
