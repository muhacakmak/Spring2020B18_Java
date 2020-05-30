package day24_Methods.WarmUpTask_return;

import java.util.Scanner;

public class Palindrome {
    /*
    3. write a method that can identify if a string is palindrome
            Task.Pizza: palindrom("level")  ==> true
                palindrome("Cybertek") ==> false
     */
    public static void main(String[] args) {
        palindrome("selcuk");
        palindrome("Anna");





    }
    public static void palindrome(String str){
      String reverse="";
        for (int i =str.length()-1;i>=0; i--) {
            reverse+=str.charAt(i);
        }
        System.out.println(str.equalsIgnoreCase(reverse));

    }
}
