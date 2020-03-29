package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_Next {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String str=scan.next();
//        System.out.println(str);
        // 7981 Jonesbranch DR, McLean VA, 22034
        String fullAddress = "";
        System.out.print("Enter the number of the building: ");
        short BNumber = input.nextShort();
        fullAddress += BNumber + " ";

        System.out.println("Enter the street name : ");
        String streetName = input.next();
        fullAddress += streetName + " ";

        System.out.println("Enter the type of the road: ");
        String roadType = input.next();
        fullAddress += roadType + ", ";

        System.out.println("Enter the city name,  state and zipCode: ");
        String cityName = input.next();
        fullAddress += cityName + " ";

        String stateName = input.next();
        fullAddress += stateName+", ";

        int zipCode=input.nextInt();
        fullAddress+=zipCode;

        System.out.println(fullAddress);



    }
}
