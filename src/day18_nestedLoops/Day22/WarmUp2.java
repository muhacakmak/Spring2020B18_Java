package day18_nestedLoops.Day22;

import java.util.Scanner;

public class WarmUp2 {
    /*it starts after 30 min
        write a program to idenfiy if a string is palindrome or not. if yes==> true,.otherwise ==> false
                level ==> level ==> palindrome
     */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        String text=input.nextLine();
        String reverse="";

        int i=text.length()-1;
        while (i>=0){

            reverse+=""+text.charAt(i);

            i--;
        }
       boolean result= text.equals(reverse);

        System.out.println("is \""+text+"\"  the same its reverse ("+reverse+") : "+result);
    }
}
