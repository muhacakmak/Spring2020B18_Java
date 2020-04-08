package day15_ForLoop.Warmup;

import java.util.Scanner;

public class Initials {
    /*
    1. write a program that asks user's first and last name, then prints out the initials of the user
			Ex:
				input:
					cybertek
					batch12
				output:your initial is: CB

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name:");
        String firstName = input.next();
        System.out.print("Enter your last name:");
        input.nextLine();
        String lastName = input.nextLine();

//        String initials = firstName.substring(0, 1)+lastName.substring(0, 1);
//        initials=initials.toUpperCase();
        String initials=""+firstName.charAt(0)+lastName.charAt(0);
        initials=initials.toUpperCase();
        System.out.println("Your initial is :" + initials);

    }
}
