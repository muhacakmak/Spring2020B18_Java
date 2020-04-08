package day16_ForLoop;

import java.util.Scanner;

public class PalindromeTest {
    /*
        write a program to idenfiy if a string is palindrome or not. if yes==> true,.otherwise ==> false
                level ==> level ==> palindrome
     */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter text: ");
        String word=input.nextLine();

        String reversedWord="";
        boolean result=true;

        for (int i = word.length()-1; i >=0 ; i--) {
            reversedWord+=word.charAt(i);
        }
        boolean palindrome=word.equalsIgnoreCase(reversedWord);
        System.out.println("Revers of word: "+reversedWord);
        System.out.println(word+" is palindrome: "+palindrome);
    }
}

