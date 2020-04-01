package day14_StringClass;

import java.util.Scanner;

public class credentials2 {
        /*

        precondition : username and password cannet be empty
        if they are empth ==> please enter the credentials
        valid credentials are:
            username: cybertek
            password: cybertekschool
        if user entered both valid username and password  ==> log in
        if valid password, invalid username ==> username is incorrect
        if valid user name, invalid password ==> password is incorrect
        if both password and username are invalied ==> invalid username and password
         */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter user name: ");
        String inputUserName = input.nextLine();
        System.out.print("Enter pass word: ");
        String inputPassWord = input.nextLine();
        String validUsername = "cybertek";
        String validPassword = "cybertekschool";
        boolean logedIn = inputUserName.equals(validUsername) && inputPassWord.equals(validPassword);
        boolean invalidUsername = !inputUserName.equals(validUsername) && inputPassWord.equals(validPassword);
        boolean invalidPassWord = inputUserName.equals(validUsername) && !inputPassWord.equals(validPassword);

        if (!inputPassWord.isEmpty() && !inputUserName.isEmpty()) {
            if (logedIn) {
                System.out.println("Loged in");
            } else if (invalidUsername) {
                System.out.println("Pass word is correct, username is incorrect");
            } else if (invalidPassWord) {
                System.out.println("Username is correct, password is incorrect");
            } else {
                System.out.println("Both username and password are incorrect");
            }
        } else {
            System.out.println("Please enter the credentials");
        }

    }
}
