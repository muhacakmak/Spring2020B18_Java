package day20_ArraysContinue;

import java.util.Scanner;

public class Months {
    /*
    Create an array that holds the days
User should be able to enter the day index and output should be:
“Today is Monday”
     */
    public static void main(String[] args) {

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; // size: 12,  : 11
        //          0       1      2

//        String [] months2=new String[12];
//        months2[0]="Jan";

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            int attempt = 1;
            while (number > 12 || number <= 0) {
                System.out.println("Invalid entry");
                System.out.println("You have entered wrong " + attempt + " attempt(s)." + "You can attempt " + (3 - attempt) + " more time(s) ");
                attempt++;
                System.out.println("Please re-enter  the number ");
                number = input.nextInt();
                if (attempt == 3 && (number > 12 || number <= 0)) {
                    System.out.println("Invalid Entry, You can't attempt new number because you have entered 3 times");
                    System.exit(0);
                }
            }
            System.out.println(number + ". Month of the year is " + months[number - 1]);
            System.out.println("Do you want to learn anther month");
            String answer = input.next();

            while (answer.equalsIgnoreCase("yes")) {
                System.out.print("Re enter a  number:");
                number = input.nextInt();
                System.out.println(number + ". Month of the year is " + months[number - 1]);
                System.out.println("Do you want to learn anther month");
                answer = input.next();
            }
            if (answer.equalsIgnoreCase("No")) {
                System.out.println("Thank you for using number of month ");
                System.exit(0);
            } else {
                System.out.println("Invalid enter");
            }
        }
    }
}
