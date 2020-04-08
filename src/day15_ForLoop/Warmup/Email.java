package day15_ForLoop.Warmup;

import java.util.Scanner;

public class Email {
    /*
    2. Given :
			username: cybertek.batch17@gmail.com
			password: JavaBeauties
			write a program for the login functionality of the email.
				- username can be either in uppercase or lowercase
				- Password MUST be as it's
				- if the user name does not end with "@gmail.com":
						print "it's not a valid email"
				- if the username ends with "@gmail.com" but username or password does not match:
						print "invalid username or password"

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Username: ");
        String userName = input.next();
        System.out.print("password: ");
        String password = input.next();
        String rightUserName = "cybertek.batch17@gmail.com";
        String rightPassWord = "JavaBeauties";
        boolean correctUser = userName.equalsIgnoreCase(rightUserName);
        boolean correctPassWord = password.equals(rightPassWord);
        String result = "";


        if (userName.endsWith("@gmail.com")) {
            if (correctUser && correctPassWord) {
                result = "You log in";

            } else if (correctUser) {
                result = "Incorrect pass word";

            } else if (correctPassWord) {
                result = "Incorrect username";
            } else {
                result = "Incorrect password and username";
            }

        } else {
            result = "it's not a valid email";
        }
        System.out.println(result);

    }
}
