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
        int price=0;
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Which bedroom do want to reserve");
            String select=input.nextLine();
            if(select.equalsIgnoreCase("King bed")){
                price+=120;
            } if(select.equalsIgnoreCase("Queen bed")){
                price+=100;
            }if(select.equalsIgnoreCase("Single bed")){
                price+=80;
            }
            while (!(select.equalsIgnoreCase("King bed")||select.equalsIgnoreCase("Queen bed")
            ||select.equalsIgnoreCase("Single bed"))){
                System.out.println("Please re-enter");
                select=input.nextLine();
            }
            System.out.println("Do want to anther room:");
            select=input.nextLine();
            if(select.equalsIgnoreCase("no")){
                System.out.println("Thank you your total price "+price);
                break;
            }

        }
    }
}