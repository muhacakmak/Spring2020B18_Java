package Introduction_to_Java.Loop;

import java.util.Random;
import java.util.Scanner;

public class LISTING_5_1_RepeatAdditionQuiz {
    /*
    Write additional program to let the user repeatedly
    enter a new answer until it is correct,
     */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        Random random = new Random();
        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);
        int correctAnswer = num1 + num2;
        System.out.println("What is "+num1+" + "+num2+" = ?");
        int answer=input.nextInt();
        while (answer!=correctAnswer){
            System.out.println("Wrong answer.Try again.\nWhat is "+num1+" + "+num2+" = ?");
            answer=input.nextInt();
        }
        System.out.println("You got it!");


    }
}
