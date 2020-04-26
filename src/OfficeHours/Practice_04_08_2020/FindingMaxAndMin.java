package OfficeHours.Practice_04_08_2020;

import java.util.Scanner;

public class FindingMaxAndMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        int max = -2_147_483_648;
        int min = 2_147_483_647;
        while (i <= 3) {
            System.out.print("Enter " + i + ". number: ");
            int num = input.nextInt();
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            i++;

        }
        System.out.println("The maximum number is  : " + max);
        System.out.println("The minimum  number is : " + min);



    }
}
