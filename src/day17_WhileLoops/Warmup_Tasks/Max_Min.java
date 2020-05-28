package day17_WhileLoops.Warmup_Tasks;

import java.util.Scanner;

public class Max_Min {
    /*
    1. write a program that can ask the user "enter a number" five times and return the maximum number
				hint: you will nedd for loop and if statement
     2. write a program that can ask the user "enter a number" five times and return the minimum number
				hint: you will nedd for loop and if statement
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int maxNumber=-999999999;
        int minNumber=2_147_483_647;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter " +i+" . number: ");
            int num = input.nextInt();
            if(num>maxNumber){
                maxNumber=num;
            }
            if(num<minNumber){
                minNumber=num;
            }

        }
        System.out.println("Seljuk number: "+maxNumber);
        System.out.println("Min number: "+minNumber);

    }
}
