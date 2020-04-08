package Repl_It;

import java.util.Scanner;

public class _073Email2_StringMethods {
    /*
    Write a program that will print out information about the user based on email.
    Print first and last name from the email with the upper case.
    (Assume that first and last names were separated by an underscore)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email");
        String email = "craig_federighi@apple.com";

        String firstName = email.substring(0, email.indexOf("_"));
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();

        String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

        String domain = email.substring(email.indexOf("@") + 1, email.indexOf("."));
        String Top_LevelDomain = email.substring(email.indexOf(".") + 1);

        System.out.println("First name: " + firstName + "\nLast Name: " + lastName + "\nDomain: "
                + domain + "\nTop-Level Domain: " + Top_LevelDomain);


    }
}
