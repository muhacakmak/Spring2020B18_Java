package day18_nestedLoops.Day22;

import java.util.Scanner;

public class NestLoopTask {
    public static void main(String[] args) {
        while (true){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two number ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("Addition is : " + (num1 + num2));

        System.out.println("Do you want to continue: ");
        String answer = input.next();

        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
            System.out.println("Invalid Entry please re enter");
            System.out.println("Do u wanna continue ");
            answer=input.next();
            }
        if(answer.equalsIgnoreCase("No")){
            break;
        }
        }
    }

}
