package day38_Constructors.task1;

import java.text.DecimalFormat;

public class SalaryCalculator {
    /*
      Create class called SalaryCalculator
            instance variables:
                hourlyRate, weeklyHours, stateTaxRate, fedralTaxRate
                add a constructor can initialize those fields
                instance methods:
                salary(): returns the total salary as double
                salaryAftertax(): retuns the salary after tax as double
                stateTax(): retuns the total state tax as double
                federalTax(): retuns the total federal tax as double
                toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()
    return hourlyRate*weeklyHours*(1-(stateTaxRate+federalTaxRate));
     */

    double hourlyRate;
    int weeklyHours;
    double stateTaxRate;
    double federalTaxRate;

    public SalaryCalculator(double hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;

    }

    public double salary() {
        return hourlyRate * weeklyHours * 52;
    }

    public double stateTax() {
        return salary() * stateTaxRate;
    }

    public double federalTax() {
        return salary() * federalTaxRate;
    }

    public double salaryAfterTax() {
        return salary() - (stateTax() + federalTax());
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Hourly Rate: $" + hourlyRate +
                "\nWeekly Hours: " + weeklyHours +
                "\nGross Salary: $" + df.format(salary()) +
                "\nState Tax: $" + df.format(stateTax()) +
                "\nFederal Tax: $" + df.format(federalTax()) +
                "\nNet Salary: $" + df.format(salaryAfterTax());
    }
}

class SalaryObjects {
    public static void main(String[] args) {
        SalaryCalculator emrah = new SalaryCalculator(62, 40, 0.0875, 0.26);
        System.out.println(emrah);
    }
}
