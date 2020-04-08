package day17_WhileLoops.Warmup_Tasks;

import java.util.Scanner;

public class calculator {
    /*
    4.	write a program that can calculate the two numbers based on the user provided operators, the program will ask:
						1. enter first number
						2. enter the second number
						3. enter the math operators
								(assume that only the +, -, *, /, and % will be entered)
						then the system will give the result based on the operator
						at the end it will ask if the user want's to calculate another numbers, if user
						entered "NO" or "no", the program will stop execution, otherwise it repeats all the previous steps
								(you will need a lop that has true condition without the iterator)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       for (int i=0; i<=3;i++) {
           System.out.print("Enter first number: ");
           int num1 = input.nextInt();
           System.out.print("Enter second number: ");
           int num2 = input.nextInt();
           System.out.println("Math operator");
           char operator = input.next().charAt(0);// + - * / %
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
           String answer=input.next();
           if(answer.equalsIgnoreCase("no")){
               break;
           }
       }
    }
}
