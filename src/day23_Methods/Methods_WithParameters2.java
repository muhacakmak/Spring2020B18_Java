package day23_Methods;

import java.util.Scanner;

public class Methods_WithParameters2 {
    // create a function that can reverse any string

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name=input.nextLine();
        ReverseString(name);



    }

    public static void ReverseString(String str) {

        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();

    }


}
