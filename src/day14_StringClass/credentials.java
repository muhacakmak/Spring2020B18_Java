package day14_StringClass;

import java.util.Scanner;

public class credentials {
    /*
        userName:cybertek
        passWord:cybertekshool
         */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter user name");
        String userName=input.next();
        System.out.println("Enter pass word");
        String passWord=input.next();

        String validUserName="cybertek";
        String validPassWord="cybertekshool";
        boolean validCredentials=userName.equals(validUserName)&&passWord.equals(validPassWord);

        if(validCredentials){
            System.out.println("Login is successfully");
        }else{
            System.out.println("Invalid");
        }

    }
}
