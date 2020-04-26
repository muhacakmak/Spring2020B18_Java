package day24_Methods;

import java.util.Scanner;

public class BirthYear {
    public static void main(String[] args) {
       // age(2000);
        printHelloCybertek();



    }
    public static void age(int birthYear){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the current year");
        int currentYear=input.nextInt();
        int age=currentYear-birthYear;
        if(age>0 && birthYear>1900){
            System.out.println(age);
        }else {
            System.out.println("invalid");
        }
    }
    public static void printHello(){
        System.out.println("Hello");
    }
    public static void printCybertek(){
        System.out.println("Cybertek");
    }
    public static void printHelloCybertek(){
        printHello();
        printCybertek();
    }



}
