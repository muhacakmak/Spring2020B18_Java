package day13_StringClass.Tasks;

import java.util.Scanner;

public class Task01_day17 {
    /*
    1-Declare scanner class opject
    2- ask user to enter first and last name
    3- declear a string variable called full name
    4- concat first and lastname and assign it to fullname
    5- display in the console total numbers of charaters in full name
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName=input.nextLine();
        System.out.print("Enter last name: ");
        String lastName=input.nextLine();

        String fullName=firstName.concat(" ").concat(lastName);
        int numberOfCharacters=fullName.length();

        System.out.println(fullName+" contains "+numberOfCharacters +" characters");


    }
}
