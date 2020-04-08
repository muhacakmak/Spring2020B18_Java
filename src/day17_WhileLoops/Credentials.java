package day17_WhileLoops;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {

        /*
        user:cybertek
        pass:cybertek123
         */


        Scanner input = new Scanner(System.in);
        System.out.print("Enter username:");
        String userName = input.next();
        System.out.print("Enter password:");
        String passWord = input.next();
        boolean valid = (userName.equals("cybertek") && passWord.equals("cybertek123"));
        int count = 1;

        while (!valid) {
            System.out.println("Please re enter your credentions");
            System.out.print("Enter username:");
            userName = input.next();
            System.out.print("Enter password:");
            passWord = input.next();
            valid = (userName.equals("cybertek") && passWord.equals("cybertek123"));///Not nessary
            count++;
            if (count == 3 && !valid) {
                System.out.println("Your account is locked");
                break;
            }
        }
        if (valid) {
            System.out.println("Logged in");
        }


    }
}

