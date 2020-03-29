package day11_Scanner.WarmupTask;

import java.util.Scanner;

public class SalaryCalculator {
    /*
    2. write a program that can calculate the salary after tax
                needed informations:
                                employee' salaray
                                state tax
                                federal tax
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your salary: $");
        int salary=input.nextInt();
        System.out.print("Enter the state tax: ");
        byte stateTax=input.nextByte();
        System.out.print("Enter the federal tax: ");
        double stateTaxPercentage=stateTax/100.0;
        byte federalTax=input.nextByte();
        double federalTaxPercentage=federalTax/100.0;
        double totalTax=salary*(stateTaxPercentage+federalTaxPercentage);
        double salaryAfterTax=salary-totalTax;

        System.out.println("Your salary after tax is : $"+salaryAfterTax);
        System.out.println("Total tax you paid: $"+totalTax);





    }
}
