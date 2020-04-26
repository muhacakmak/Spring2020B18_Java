package Repl_It.Loop;

import java.util.Scanner;

public class _083_Party_Loop_Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String guestList = "";
        System.out.println("Please enter guest name:");
        String guestName = input.nextLine();
        guestList += guestName+", ";

        while (true) {
            System.out.println("Do you want to enter new guest name:");
            String answer = input.next();

            while (answer.equalsIgnoreCase("Yes")) {
                System.out.println("Please enter guest name:");
                answer = input.next();
                guestList += answer+", ";
            }//               emrah, selcuk,
            if (answer.equalsIgnoreCase("No")) {

              guestList=guestList.substring(0,guestList.length()-2);
                System.out.println("Guest's list: " + guestList);
                System.exit(0);
            }
        }
    }
}
