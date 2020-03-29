package Task;

import java.util.Scanner;

public class employed {
    public static void main(String[] args) {


    Scanner userInput =new Scanner(System.in);
        System.out.println("Enter your first name ");
    String firstName = userInput.next();
        System.out.println("Enter your last name: ");
    String lastName = userInput.next();
    String fullName =  firstName+" "+lastName;
        System.out.println("Are you currently employed?");
        String statues=userInput.next();

    double salary;
        if (statues.equalsIgnoreCase("yes")){
        System.out.println("Enter your salary: ");
        salary = userInput.nextDouble();
    }else if(statues.equalsIgnoreCase("no")) {
        salary=0;

        System.out.println("Your full name is: "+fullName+".");
        System.out.println("Employment status: " +statues);
        System.out.println("Your salary is: $"+salary);
}else {
            System.out.println("Invalid entry");
        }
}}