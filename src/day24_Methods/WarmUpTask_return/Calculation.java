package day24_Methods.WarmUpTask_return;

import java.util.Scanner;

public class Calculation {
    /*
             Ex: Seljuk(10, 20) ==> 20
    2. write a method called Calculation, that passes 3 parameters: 2 numbers and one operator, and prints out the calculation
        if operator is not between [-, +, *, /, %] output should be Invalid Operator
        Ex: calculate(10, 2, '*') ==> 20;
            calculate(10, 2, '&') ==> Invalid operator
            NOTE: The method MUST take three arguments when it's called
     */
    public static void main(String[] args) {

        calculation(10, 20, '*');
        calculation(30, 40, '+');

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter num1: ");
            int num1 = input.nextInt();
            System.out.print("Enter num2: ");
            int num2 = input.nextInt();
            System.out.print("Enter operator ");
            char operator = input.next().charAt(0);

            calculation(num1, num2, operator);
            System.out.println("Do you want to continue?");
            String answer = input.next();
            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.out.println("invalid Entry,Please re-enter");
                System.out.println("Do you want to continue?");
                answer = input.next();
            }
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you..");
                break;
            }
        }

    }

    public static void calculation(int num1, int num2, char operator) {

        switch (operator) {

            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '%':
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Invalid");
        }
    }
}








