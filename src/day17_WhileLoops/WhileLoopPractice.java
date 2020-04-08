package day17_WhileLoops;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        /*
        ask the user to enter yes or no
        if the user enter other yes or no repeat the previous step
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter yes or no");
        String word=input.next();

        while (!(word.equalsIgnoreCase("yes")) || !(word.equalsIgnoreCase("No"))){
            System.out.println("Please re-enter");
          word=input.next();
        }

        if(word.equalsIgnoreCase("Yes")){
            System.out.println("Entered yes");
        }
        if(word.equalsIgnoreCase("no")){
            System.out.println("Enter No");
        }



    }
}
