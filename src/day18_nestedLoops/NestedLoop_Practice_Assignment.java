package day18_nestedLoops;

import java.util.Scanner;

public class NestedLoop_Practice_Assignment {
    /*
    use switch for other operation
     */
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter two number");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            System.out.println("Addition of two numbers : " + (num1 + num2));
            System.out.println("Do you want to continue? ");
            String answer=input.next();

            while (!(answer.equalsIgnoreCase("yes")|| answer.equalsIgnoreCase("no"))){
                System.out.println("Invalid entry, please re-enter, yes or no");
                answer=input.nextLine();

            }

            if(answer.equalsIgnoreCase("no")){
                System.out.println("Thank you for using the calculator");
                break;
            }
        }



    }
}
