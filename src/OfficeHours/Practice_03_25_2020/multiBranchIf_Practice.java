package OfficeHours.Practice_03_25_2020;

public class multiBranchIf_Practice {
    public static void main(String[] args) {
        int number = 0;

        if (number > 0) {
            System.out.println("It is positive number");
        } else if (number < 0) {
            System.out.println("It is negative number");
        } else {
            System.out.println("It is zero");
        }
        int num1 = 100;
        int num2 = 200;
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);

        } else if (num2 > num1) {
            System.out.println(num2 + " is greater than " + num1);
        } else {
            System.out.println(num1 + " is equal to  " + num2);
        }
        System.out.println("=======================================");
        String browserName = "Chrome";
        if (browserName == "Firefox") {
            System.out.println("Firefox browser is opening");
        } else if (browserName == "Chrome") {
            System.out.println("Chrome browser is opening");
        } else if (browserName == "Internet Explore ") {
            System.out.println("Internet Explore is opining");
        } else if (browserName == "Opera") {
            System.out.println("Opera browser is opening");
        } else {
            System.out.println("Invalid Browser name");
        }


    }
}

