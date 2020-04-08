package Repl_It;

import java.util.Scanner;

public class _047RealEstateCalculator_StringMethods {
    public static void main(String[] args) {
        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard=true, smoking, garage;
        String houseType;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
        System.out.println("Enter your property type:");
        houseType = scan.nextLine();
        System.out.println("How many bedrooms do you have?");
        numberOfBedrooms = scan.nextInt();
        System.out.println("Do you have a backyard?");
        backyard = scan.nextBoolean();


        System.out.println("Pardon, it's not a public parking!\nHow close is metro station?");
        metroAccessibility = scan.nextFloat();
        System.out.println("How close is highway?");
        highwayAccessibility = scan.nextFloat();
        System.out.println("What's the rating of nearest school?");
        schoolScore = scan.nextFloat();
        System.out.println("Does any of your family members smoking?");
        smoking = scan.nextBoolean();

        int priceBaseOnTypeofProperty = 0;
        int priceBaseOnNumberOfBedrooms = numberOfBedrooms*30_000;
        int priceBaseOnBackyard = 0;

        int priceBaseOnMetro = 0;
        int priceBaseOnHighway = 0;
        int priceBaseOnSchoolRating = 0;
        int priceBaseOnSmoking = 0;

        if (houseType.equalsIgnoreCase("Condo")) {
            priceBaseOnTypeofProperty = 50_000;

            if (backyard) {
                priceBaseOnBackyard = 5_000;
            } else {
                System.out.println("Backyard is not available for condo!");
                priceBaseOnBackyard = 0;
            }
        } else if (houseType.equalsIgnoreCase("Townhouse")) {
            priceBaseOnTypeofProperty = 75_000;

        } else if (houseType.equalsIgnoreCase("Single Family Home")) {
            priceBaseOnTypeofProperty = 95_000;
        }
        System.out.println("Do you have garage?");
        garage = scan.nextBoolean();
        System.out.println("How many spots?");
        garageSpots = scan.nextInt();

        int priceBaseOnGarageSpots = garageSpots*20_000;



        if (garage) {

            System.out.println(" Pardon,  it's not a public parking!");
        }

            if (metroAccessibility <= 1) {
                priceBaseOnMetro = 10_000;

            } else if (1 < metroAccessibility || metroAccessibility <= 3) {
                priceBaseOnMetro = 5_000;
            }



        if (highwayAccessibility <= 1) {
            priceBaseOnHighway = 15_000;

        } else if (1 < highwayAccessibility && highwayAccessibility < 5) {
            priceBaseOnHighway = 8_000;
        } else if (5 <= highwayAccessibility && highwayAccessibility <= 20) {
            priceBaseOnHighway = 4_00;
        }


        if (8 < schoolScore || schoolScore <= 10) {
            priceBaseOnSchoolRating = 45_000;

        } else if (schoolScore < 8 || 4 <= schoolScore) {
            priceBaseOnSchoolRating = 20_000;
        } else {
            priceBaseOnSchoolRating = 5_000;
        }
        if (!smoking) {
            priceBaseOnSmoking = 5_000;
        }


        propertyPrice = priceBaseOnTypeofProperty + priceBaseOnNumberOfBedrooms + priceBaseOnBackyard + priceBaseOnGarageSpots + priceBaseOnMetro
                + priceBaseOnHighway + priceBaseOnSchoolRating - priceBaseOnSmoking;
        System.out.println("Market report has been generated.\nYour estimate market price is: $" + propertyPrice);


    }
}
