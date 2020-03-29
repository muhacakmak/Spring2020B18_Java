package day11_Scanner;

import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter full name: ");
        String fullName=input.nextLine();
        System.out.print("Your full name is : "+fullName);
        System.out.print("\nEnter your sentence: ");
        String sentence=input.nextLine();
        System.out.println("Your entered: "+sentence);
    }
}
