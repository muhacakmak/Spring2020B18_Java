package day11_Scanner;

import java.util.Scanner;

public class NextLine_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Your age is: " + age);
        input.nextLine();
        System.out.print("\nEnter your full name: ");
        String fullName = input.nextLine();
        System.out.println("\nYour full name is: "+fullName);


    }
}
