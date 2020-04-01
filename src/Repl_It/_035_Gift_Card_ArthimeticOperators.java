package Repl_It;

import java.util.Scanner;

public class _035_Gift_Card_ArthimeticOperators {
    /*
     Let's say I've got a 100$ gift card and you want to buy something in your online store .
     Write a program that will help me to buy something and display leftover balance after purchase.
     If item is not in the list, display message: "Invalid item!".
     If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter item: ");
        String item = scan.nextLine();
        System.out.print("Enter Price: $");
        int price = scan.nextInt();
        int change = 100 - price;
        boolean canBuy=item.equals("Charger") || (item.equals("USB cable")) || (item.equals("Headphones")) || (item.equals("Pants"))
                || (item.equals("Hat")) || (item.equals("Socks")) || (item.equals("Blanket")) || (item.equals("Pillow"));
        if (price <= 100) {
            if (canBuy) {
                System.out.println("Thank you for your purchase!\nYour current balance is: " + change + "$");
            } else if (item.equals("Smartphone") || item.equals("Laptop")) {
                System.out.println("Sorry, not enough funds on your gift card!");
            } else {
                System.out.println("Invalid item!");
            }
        } else {
            System.out.println("Sorry, not enough funds on your gift card!");
        }
//        int price = scan.nextInt();
//        if (item.equals("Charger")) {
//            System.out.println("Thank you for your purchase!\nYour current balance is: 85$");
//        } else if (item.equals("USB cable")) {
//            System.out.println("Thank you for your purchase!\nYour current balance is: 90$");
//        } else if (item.equals("Headphones")) {
//            System.out.println("Thank you for your purchase!\nYour current balance is: 70$");
//        } else if (item.equals("Pants")) {
//            System.out.println("Thank you for your purchase!\nYour current balance is: 50$");
//        } else if (item.equals("Hat")) {
//            System.out.println("Thank you for your purchase!\nYour current balance is: 75$");
//        } else if (item.equals("Socks")) {
//            System.out.println("Thank you for your purchase!\nYour current balance is: 95$");
//        } else if (item.equals("Blanket")) {
//            System.out.println("Thank you for your purchase!\nYour current balance is: 60$");
//        } else if (item.equals("Smartphone") || item.equals("Laptop")) {
//            System.out.println("Sorry, not enough funds on your gift card!");
//        } else {
//            System.out.println("Invalid item!");
//        }




    }
}
