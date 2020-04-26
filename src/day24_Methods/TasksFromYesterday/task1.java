package day24_Methods.TasksFromYesterday;

import java.util.Scanner;

public class task1 {
    /*
    1. write a method called KmToMiles that can convert km to miles
	 				1 km = 0.612 miles
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number for km: ");
        double km=scan.nextDouble();
        KmToMiles(km);



    }
    public static void  KmToMiles(double km){
        double miles= km*0.612;
        System.out.println(km+" km = "+miles+ " miles ");



    }
}
