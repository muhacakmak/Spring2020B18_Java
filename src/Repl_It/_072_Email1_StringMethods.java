package Repl_It;

import java.util.Scanner;

public class _072_Email1_StringMethods {
    /*
    In this task, you need to swap the first name with the last name in the email.
    If the email doesn't contain underscore - do not do anything.

Example:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com

Example:
input: barakobama@gmail.com
output: barakobama@gmail.com
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email");
        String email = "craig_federighi@apple.com";
        String result = "";
        String domain = email.substring(email.indexOf("@"));
        if (email.contains("_")) {

            String firstName = email.substring(0, email.indexOf("_"));

            String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));

            result = lastName + "_" + firstName + domain;

        } else {
            result = email;
        }
        System.out.println(result);
    }
}
