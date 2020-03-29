package Task;

import java.util.Scanner;

public class changeMoney {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter price in cent: ");
        int itemPrice = input.nextInt();
        System.out.print("Amount of money you give casher:");
        int payment = input.nextInt();
        int changeMoney = payment - itemPrice;
        int quarters = changeMoney / 25;
        changeMoney -= 25 * quarters;
        int dimes = changeMoney / 10;
        changeMoney -= dimes * 10;
        int nickles = changeMoney / 5;
        String message = " ";
        if (itemPrice <= 25 || itemPrice >= 100 || itemPrice % 5 != 0) {
            message = "Invalid price!";
        } else {
            message = "Your change is " + quarters + " quarters "
                    + dimes + " dimes " + nickles + " nickels. ";
        }
        System.out.println(message);

    }

}
