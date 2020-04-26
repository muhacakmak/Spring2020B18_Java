package Introduction_to_Java.Loop;



import java.util.Random;
import java.util.Scanner;

public class Case_Study_5_2_1_GuessingNumbers {
   /* The problem is to guess what number a computer has in mind.
    You will write a program that randomly generates an integer
    between 0 and 100, inclusive. The program prompts the user
    to enter a number continuously until the number matches the
    randomly generated number. For each user input, the program
    tells the user whether the input is too low or too high,
    so the user can make the next guess intelligently. Here is a sample run:

    Guess a magic number between 0 and 100
        Enter your guess: 50
        Your guess is too high
        Enter your guess: 25
        Your guess is too low
        Enter your guess: 42
        Your guess is too high
        Enter your guess: 39
        Yes, the number is 39
    */
    public static void main(String[] args) {
        Random random=new Random();
        int computerNumber=random.nextInt(100);
       System.out.println(computerNumber);
        System.out.print("Guess a magic number between 0 and 100: ");
        Scanner input=new Scanner(System.in);
        int userAnswer=input.nextInt();
        String result="";
        while (userAnswer!=computerNumber){
            if(userAnswer>computerNumber){
                result="Too high\nRe enter again:";
            }else{
                result="Too Low\nRe enter again:";
            }
            System.out.println(result);
            userAnswer=input.nextInt();

        }

        System.out.println("Yes the number is "+computerNumber);

    }
}
