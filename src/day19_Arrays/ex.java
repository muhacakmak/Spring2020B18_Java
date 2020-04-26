package day19_Arrays;

import java.util.Scanner;
/*
     // write a program that asks "enter a name" 10 times, and store each of the names in the array students
     */
public class ex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] name = new String[5];
        for (int i = 0; i <= name.length - 1; i++) {
            System.out.println("Enter player names");
            name[i] = scan.next();
        }
        for (int i = 0; i <= name.length - 1; i++) {
            System.out.print((i + 1) + "." + name[i] + " ");
        }
    }
}