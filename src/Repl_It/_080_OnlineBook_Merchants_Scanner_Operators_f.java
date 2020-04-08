package Repl_It;

import java.util.Scanner;

public class _080_OnlineBook_Merchants_Scanner_Operators_f {
    /*
     Online Book Merchants offers premium customers 1 free book with every purchase
     of 5 or more books and offers 2 free books with every purchase of 8 or more books.
     It offers regular customers 1 free book with every purchase of 7 or more books,
     and offers 2 free books with every purchase of 12 or more books.

     Write a program that assigns freeBooks the appropriate value based on the values
     of the boolean variable isPremiumCustomer and the int variable nbooksPurchased.
     Print amount of freeBooks into the console.
     */
    public static void main(String[] args) {
        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        boolean isPremiumCustomer = scan.nextBoolean();
        int nBooksPurchased = scan.nextInt();

        if (isPremiumCustomer) {
            if (nBooksPurchased >= 5 && nBooksPurchased < 8) {
                freeBooks += 1;
            } else if (nBooksPurchased >= 8) {
                freeBooks += 2;
            }
        } else {
            if (nBooksPurchased >= 7 && nBooksPurchased < 12) {
                freeBooks += 1;
            } else if (nBooksPurchased >= 12) {
                freeBooks += 2;
            }
        }

        System.out.println(freeBooks);


    }
}
