package day18_nestedLoops;

import java.util.Scanner;

public class Assignment {
    /*
    Assignment:
    write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
                should ask which bedroom do you wanna reserve
                    if user provided invalid entry => please re-enter
                    calculate the total price
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            if answer either yes or no ==> please re-enter
     */
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Which bedroom do you want to reserve");
            String room = input.nextLine();
            boolean rightSelect = room.equalsIgnoreCase("King bed") || room.equalsIgnoreCase("Queen Bed")
                    || room.equalsIgnoreCase("Single bed");
            int price = 0;


            if (room.equalsIgnoreCase("King bed")) {
                price += 120;
            } else if (room.equalsIgnoreCase("Queen Bed")) {
                price += 100;
            } else if (room.equalsIgnoreCase("Single bed")) {
                price += 80;
            }
            System.out.println("Do you want reserve another room:");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                if (room.equalsIgnoreCase("King bed")) {
                    price += 120;
                } else if (room.equalsIgnoreCase("Queen Bed")) {
                    price += 100;
                } else if (room.equalsIgnoreCase("Single bed")) {
                    price += 80;
                }
            }
            while (!rightSelect) {
                System.out.println("please re-enter");
                input.nextLine();
            }

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you...\nyour total price is: " + price);
                break;
            }
        }
    }
}