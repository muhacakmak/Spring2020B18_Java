package Repl_It;

import java.util.Scanner;

public class _047RealEstateCalculator_StringMethods_2 {
    public static void main(String[] args) {
        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
        System.out.println("Enter your property type:");
        houseType = scan.nextLine();
        if (houseType.equalsIgnoreCase("Condo")) {
            propertyPrice += 50_000;

        } else if (houseType.equalsIgnoreCase("Townhouse")) {
            propertyPrice = 75_000;

        } else if (houseType.equalsIgnoreCase("Single Family Home")) {
            propertyPrice = 95_000;
        }
        System.out.println("How many bedrooms do you have?");
        numberOfBedrooms = scan.nextInt();
        propertyPrice += numberOfBedrooms * 30_000;

        System.out.println("Do you have a backyard?");
        backyard = scan.nextBoolean();
        if (backyard) {
            if (houseType.equalsIgnoreCase("Condo"))
                System.out.println("Backyard is not available for condo!");
        } else {

            propertyPrice += 5_000;
        }
        System.out.println("Do you have garage?");
        garage = scan.nextBoolean();
        System.out.println("How many spots?");
        garageSpots = scan.nextInt();
        if (garage) {
            if (garageSpots>=1 && garageSpots < 11) {
                propertyPrice += garageSpots * 20_000;
            } else {
                System.out.println("Pardon,  it's not a public parking!");
            }
        }
        System.out.println("How close is metro station?");
        metroAccessibility = scan.nextFloat();
        if (metroAccessibility <= 1) {
            propertyPrice += 10_000;
        } else if (1 < metroAccessibility && metroAccessibility <= 3) {
            propertyPrice += 5_000;
        }
        System.out.println("How close is highway?");
        highwayAccessibility = scan.nextFloat();
        if (highwayAccessibility <= 1) {
            propertyPrice += 15_000;
        } else if (1 < highwayAccessibility && highwayAccessibility < 5) {
            propertyPrice += 8_000;
        } else if (5 <= highwayAccessibility && highwayAccessibility <= 20) {
            propertyPrice += 4_000;
        }
        System.out.println("What's the rating of nearest school?");
        schoolScore = scan.nextFloat();
        if (8 <= schoolScore && schoolScore <= 10) {
            propertyPrice += 45_000;

        } else if (schoolScore <8 && 4 <= schoolScore) {
            propertyPrice += 20_000;
        } else {
            propertyPrice += 5_000;
        }
        System.out.println("Does any of your family members smoking?");
        smoking = scan.nextBoolean();
        if (smoking) {
            propertyPrice -= 5_000;
        }

        System.out.println("Market report has been generated.\nYour estimate market price is: " + propertyPrice + "$");

    }
}
