package day14_StringClass.Task;

import java.util.Scanner;

public class checkWord {
    /*
    1. Write a program CheckWords:
	Program accepts 3 words and :
	- if they are same lengthMethods:      print "All words are same lengthMethods"
	- if some same lengthMethods and others not:    print "Not Same nor Different lengths"
	- if all different lengthMethods :  print "All different lengthMethods"
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 = input.next();
        System.out.println("Enter second word");
        String word2 = input.next();
        System.out.println("Enter third word");
        String word3 = input.next();

        int length1 = word1.length();
        int length2 = word2.length();
        int length3 = word3.length();
        boolean allSame=(length1==length2 && length1==length3 && length2==length3);
        boolean notSome=(length1!=length2 && length1!=length3 && length2!=length3);

        if(allSame){
            System.out.println("All words are same lengthMethods");
        }else if(notSome){
            System.out.println("All different");
        }else{
            System.out.println("Not same nor Different lengths");
        }
    }
}
