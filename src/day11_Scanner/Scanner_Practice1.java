package day11_Scanner;

import java.util.Scanner;
/*
Task: Scanner_Practice1
    1. ask the user enter first name
    2. ask user to enter last name
    3. ask the user employeed or not? true ==> employeed, false ==> unemployeed
    4. if he is employeed , ask the salary
    4. if he is not employeed set the salary to 0
    output:
        full name:
        employeeed status:
        salary:
 */

public class Scanner_Practice1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double salary=0;
        System.out.print("Enter your first name: ");
        String firstName=input.next();
        System.out.print("Enter your last name: ");
        String lastName=input.next();
        System.out.print("Are you working or not: ");
        boolean workingOrNot=input.nextBoolean();
        if(workingOrNot) {
            System.out.print("Enter your salary: $");
            salary = input.nextInt();
        }
            System.out.println("Full name: " + firstName + " " + lastName);
            System.out.println("Employed status : " + workingOrNot);
            System.out.println("Salary: $" + salary);

    }
}
