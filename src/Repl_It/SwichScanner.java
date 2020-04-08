package Repl_It;

import java.util.Scanner;

public class SwichScanner {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a Number:");
            int number = scan.nextInt();
            String result ="";
            switch(number) {
                case 1:
                    result = "One";
                    break;
                case 2:
                    result = "Two";
                    break;
                case 3:
                    result = "Three";
                    break;
                default:
            }
            System.out.println(result);
        }
}
