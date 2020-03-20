package day03_VariablesContinue;
/* Task1 08:
    Create a class called salary calculator, write a program that can calculate
    the taxt, and salary after tax based on the hourly rate & tax rates
            ex:
                if:
                    rate = 55;
                    stateTax = 0.04;
                    federalTax =0.22;
                    weeklyHours = 40;
                then output will be:
                    your salary is: 105600 USD
                    your total tax is: 27456 USD
                    your income after tax is: 78144 USD
                if:
                    rate = 45.25;
                    stateTax =0.045;
                    federalTax = 0.25;
                    weeklyHours = 45;
                then output will be:
                    your salary is: 91260 USD
                    your total tax is: 26921.7
                    your income after tax: 64338.3 USD
     */

public class Calculator {
    public static void main(String[] args) {
        double hourlyRate=55;
        double stateTaxRates=0.04;
        double federalTaxRates=0.22;
        double weeklyHour=40;
        double yourSalary=hourlyRate*weeklyHour*4*12;
        double incomeAfterTax=yourSalary*(1-(stateTaxRates+federalTaxRates));

        System.out.println("Your salary is: $"+(int)yourSalary+".");
        System.out.println("Your total tax is: $"+ yourSalary*(stateTaxRates+federalTaxRates)+".");
        System.out.println("Your income after tax: $"+incomeAfterTax+".");
        System.out.println(Math.abs(100-30));

    }
}
