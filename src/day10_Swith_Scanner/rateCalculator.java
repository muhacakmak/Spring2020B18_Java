package day10_Swith_Scanner;

import java.util.Scanner;

public class rateCalculator {
    /*
    write a program for the rate calculater: rateCalculator
                        1. asks the user to enter salary (as integer)
                        2. asks the user how many hours does she/he works in a week
                        3. print the hourly rate of the employee
                        assume that one year has 52 weeks
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your salary: $");
        int salary = input.nextInt();
        System.out.print("How many hours do you work per week: ");
        byte weeklyHours = input.nextByte();
        System.out.print("How many weeks do you work in a year: ");
        byte numberOfWeeks = input.nextByte();
        int hourlyRate = (salary / numberOfWeeks) / weeklyHours;
        System.out.println("Your hourly rate :$" + hourlyRate);

    }
}
