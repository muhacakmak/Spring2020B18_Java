package day13_StringClass.WarmUpTask;

import java.util.Scanner;

public class ShippingInfo {
    /*
    2. write a program for the shipping info that, the program should ask:
					building number
					Street address (Assume it has more than one word)
					city name
					state name
					zip code
					full name of the person:
			and prints the ship to info in the following format:
			Pizza output:
					Ship To:  Jimmy joe
							  7925 Jones Branch Dr
							  MCLean, VA 22102
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your building number: ");
        String buildingNumber=input.next();
        input.nextLine();
        System.out.print("Enter the street address: ");
        String streetNumber=input.nextLine();
        System.out.print("Enter your city name: ");
        String cityName=input.nextLine();

        System.out.print("Enter your state: ");
        String stateName=input.nextLine();

        System.out.print("Enter your zip code: ");
        String zipCode=input.next();
        input.nextLine();
        System.out.print("Enter your Full Name: ");
        String fullName=input.nextLine();

        String result= "Ship To:"+fullName+"\n\t\t "+buildingNumber+" "+streetNumber+" "+"\n\t\t "+cityName+", "+stateName+" "+zipCode;

        System.out.println(result);












    }
}
