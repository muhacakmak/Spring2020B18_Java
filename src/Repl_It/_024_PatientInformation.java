package Repl_It;

import java.util.Scanner;

public class _024_PatientInformation {
    public static void main(String[] args) {
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.nextLine();
        System.out.println("Enter your last name");
        String lastName = scan.nextLine();
        String fullName = "Full name: " + lastName + ", " + firstName;
        System.out.println("Enter your email");
        String email = scan.nextLine();
        String address = "";
        System.out.println("Enter your street");
        String street = scan.nextLine();
        address += street + ", ";
        System.out.println("Enter your city");
        String city = scan.nextLine();
        address += city + ", ";
        System.out.println("Enter your state");
        String state = scan.nextLine();
        address += state + " ";
        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();
        address += zipCode;

        String contacts = "";
        System.out.println("Enter your work phone number");
        long workPhoneNumber = scan.nextLong();
        contacts += "work phone number - " + workPhoneNumber;
        System.out.println("Enter your personal phone number");
        long personalPhoneNumber = scan.nextLong();
        contacts += ", personal phone number - " + personalPhoneNumber;
        scan.nextLine();

        contacts += ", email: " + email;
        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("Enter your height");
        double height = scan.nextDouble();
        System.out.println("Enter your weight");
        double weight = scan.nextDouble();
        System.out.println("Are you married?");
        boolean isMarried = scan.nextBoolean();

        System.out.println("Patient personal information\n" + fullName + "\nAddress: " + address + "\nContacts: "
                + contacts + "\nAge: " + age + "\nHeight: " + height + "\nWeight: " + weight +
                " pounds\nMarried?: " + isMarried);


    }
}
