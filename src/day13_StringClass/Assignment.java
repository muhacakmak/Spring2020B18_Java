package day13_StringClass;

import java.util.Scanner;

public class Assignment {
    /*
        Assignment:
            write me a programk that asks the user fiurt and last names, then prints the initials.
            ex:
                input:
                    cybertek
                    school
                output:
                    CS
         */
    public static void main(String[] args) {
        int num;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName=input.nextLine();
        System.out.print("Enter last name: ");
        String lastName=input.nextLine();

        String firstNameInitial=firstName.substring(0,1).toUpperCase();
        String lastNameInitial=lastName.substring(0,1).toUpperCase();


        System.out.println("you have entered  \""+firstName+" "+lastName+"\"\' " +
                "as a full name and your initial is:"+firstNameInitial+lastNameInitial);













    }
}
