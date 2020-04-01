package day14_StringClass.Task;

import java.util.Scanner;

public class StartEndWords {
    /*
    2. Write a program StartEndWords:
	you have 2 words that must be 5 characters, and check if last letter of first word and first letter of second work are same.
		if either one not 5 chars length:    print "need to be exactly 5 chars length"
		if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
		if they do not match:  print "Buzz - did not match"
		pre condition : both words Must have 5 charters
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first word : ");
        String word1 = input.next();
        System.out.print("Enter second word: ");
        String word2 = input.next();

        word1=word1.toLowerCase();
        word2=word2.toLowerCase();

        int length1 = word1.length();
        int length2 = word2.length();

        if(length1==5 && length2==5){
            if(word1.charAt(length1-1)==word2.charAt(0)){
                System.out.println("Fizz");
            }else {
                System.out.println("Buzz");
            }
        }else{
            System.out.println("Need to be exactly 5 chars length");
        }

    }
}
