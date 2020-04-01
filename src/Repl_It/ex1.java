package Repl_It;

import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Split:");
        String split = input.nextLine();
        System.out.print("Number of people:");
        int numberOfPeople = input.nextInt();
        System.out.print("Check amount:");
        double checkAmount = input.nextDouble();
        input.nextLine();
        System.out.print("Service Quality:");
        String serviceQuality = input.nextLine();
        double tipResult = 0;
        switch (serviceQuality) {
            case "Poor":
                tipResult = 0.05 * checkAmount;
                break;
             case "Fair":
                tipResult = 0.10 * checkAmount;
                break;
             case "Good":
                tipResult = 0.15 * checkAmount;
                break;
             case "Great":
                tipResult = 0.20 * checkAmount;
                break;
             case "Excellent":
                tipResult = 0.25 * checkAmount;
                break;
        }
        String head=(numberOfPeople==1)?"&":(numberOfPeople==2)?"&&":(numberOfPeople==3)?"&&&":"&&&&";

        double tipPerPerson=tipResult/numberOfPeople;
        double perPeron = (checkAmount +tipResult)/ numberOfPeople;
        double totalPayment=checkAmount+tipResult;

        if (split.equalsIgnoreCase("yes")) {

            System.out.println("\nNumber of people entered: " + head + "\nTotal to pay: " + totalPayment + "\nTotal tip: " +tipResult
                    +"\nTotal per person: "+perPeron+"\nTip per person: "+tipPerPerson);


        } else {
            System.out.println("Total to pay: " + totalPayment + "\nTotal tip: " +tipResult
                    +"\nTotal per person: "+perPeron);

        }


    }
}
