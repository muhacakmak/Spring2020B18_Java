package day20_ArraysContinue;

import java.util.Scanner;

public class Days {
    /*
    Create an array that holds the days
User should be able to enter the day index and output should be:
“Today is Monday”
     */
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};  // size: 7,  max index: 6
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int attempt = 1;
        int attempt1 = 1;
        while (number > 7 || number < 0) {
            System.out.println("Invalid Entry");
            System.out.println(attempt + ". attempt invalid you have still  " + (3 - attempt) + " attempt(s)");
            attempt++;
            System.out.println("Re-enter a number:");
            number = input.nextInt();
            if (attempt == 3 && (number > 7 || number < 0)) {
                System.out.println("You have already attempted 3 times . Good bye ");
                System.exit(0);
            }
        }
        while (number < 7 && number > 0) {
            String result = days[number - 1];
            System.out.println(result + " is " + (number) + ". day of week.");
            System.out.println("Do you want to enter anther number :");
            String answer = input.next();
            if (answer.equalsIgnoreCase("Yes")) {
                System.out.println("Re-enter a number:");
                number = input.nextInt();
                while (number > 7 || number < 0) {
                    System.out.println("Invalid Entry");
                    System.out.println(attempt1 + ". attempt invalid you have still  " + (3 - attempt1) + " attempt(s)");
                    attempt1++;
                    System.out.println("Re-enter a number:");
                    number = input.nextInt();

                    if (attempt1 == 3 && (number > 7 || number < 0)) {
                        System.out.println("You have already attempted 3 times . Good bye ");
                        System.exit(0);
                    }
                    result = days[number - 1];
                    System.out.println(result + " is " + (number) + ". day of week.");

                }
            } else if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you bye ");
                System.exit(0);
            }else{
                System.out.println("Invalid Entry");
                System.exit(0);
            }
        }

    }
}

