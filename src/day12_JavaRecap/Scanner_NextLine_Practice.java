package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLine_Practice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // 1625 Goshen Lane , Somerset NJ, 08873
        System.out.println("Building Number: ");
        String BNumber=scan.next();

        //System.out.println("Building number is : "+BNumber);

        scan.nextLine();

        System.out.println("Enter Street name :");
        String street=scan.nextLine();
       // System.out.println("Street name is: "+street);

        System.out.println("Enter the zip code: ");
        String zipCode=scan.next();

        scan.nextLine();

        System.out.println("Enter the city name and state sepereted  by comma and space");
        String citySate=scan.nextLine();

        String fullName=BNumber+" "+street+", \n"+citySate+" "+zipCode;
        System.out.println(fullName);
        scan.close();


    }
}
