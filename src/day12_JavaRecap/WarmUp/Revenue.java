package day12_JavaRecap.WarmUp;

import java.util.Scanner;

public class Revenue {
    /*Revenue can be calculated as the selling price of the product times the quantity sold,
    i.e. revenue = price × quantity. Write a program that asks the user to enter product price
    and quantity and then calculate the revenue.
     If the revenue is more than 5000 a discount is 10% offered.
     Program should display the discount and net revenue.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter item's price: $");
        int itemPrice = scan.nextInt();
        System.out.print("Enter quantity: ");
        int quantity = scan.nextInt();
        int totalRevenue = itemPrice * quantity;
        System.out.println("Total Price is: $" + totalRevenue);
        double disc = totalRevenue * 0.10;
        double netAfterDiscount = totalRevenue - disc;
        if (totalRevenue >= 5000) {
            System.out.println("Discount amount is: $" + disc);
            System.out.println("Net revenue after discount : $" + netAfterDiscount);

        } else {
            System.out.println("Net revenue: $" + totalRevenue);
        }
    }
}