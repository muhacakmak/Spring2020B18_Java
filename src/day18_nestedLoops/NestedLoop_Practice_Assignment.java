package day18_nestedLoops;

import java.util.Scanner;

public class NestedLoop_Practice_Assignment {
    /*
    use switch for other operation
     */
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int num1 = input.nextInt();
            System.out.print("Enter second number: ");
            int num2 = input.nextInt();
            System.out.println("Please select your operation");
            System.out.println("|+   -|");
            System.out.println("|  %  |");
            System.out.println("|*   /|");
            char operator = input.next().charAt(0);
            String result = " ";

            if (("" + operator).equals("+")) {
                result = "Addition is: " + (num1 + num2);
            } else if (("" + operator).equals("-")) {
                result = result = "Subtraction is: " + (num1 - num2);
            } else if (("" + operator).equals("*")) {
                result = result = "Multiplication  is: " + (num1 * num2);
            } else if (("" + operator).equals("/")) {
                result = result = "Division is: " + (num1 / num2);
            } else if (("" + operator).equals("%")) {
                result = result = "Remainder is: " + (num1 % num2);
            } else {
                result = "Invalid Operator";
            }
            System.out.println(result);
            System.out.println("Do you wanna continue ? ");
            String answer = input.next();
            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.out.println("Invalid entry, please re-enter, yes or no");
                answer = input.nextLine();
            }
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using the calculator");
                break;
            }
        }


    }
}
