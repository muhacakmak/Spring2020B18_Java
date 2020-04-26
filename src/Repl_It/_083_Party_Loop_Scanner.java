package Repl_It;

import java.util.Scanner;

public class _083_Party_Loop_Scanner {
    /*
    Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
Ask for the first guest name.
Then ask does user want to enter one more guest.
 If yes - take input from.
If not - finish the program and print list of the guests.
Example of the program:
Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no

Guest's list: Nick, Linda

     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String guests="";
        while (true) {
            System.out.println("Please enter guest name:");
            String name = input.next();
            System.out.println("Do you want to enter new guest name:");
            String answer = input.next();
            while  (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.out.println("Please re-enter Yes or No");
                answer = input.next();
            }
            guests+=name+", ";
            if (answer.equalsIgnoreCase("no")) {
                guests=guests.substring(0,guests.length()-2);

                System.out.println("Guest's list: "+guests);
                System.exit(0);
            }
        }
    }
}
