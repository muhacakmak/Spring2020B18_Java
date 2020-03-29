package OfficeHours.Practice_03_18_2020;

public class SingleIf_Practice2 {
    public static void main(String[] args) {
        byte age = 30;
        boolean eligibleToBuy = age > 21 || age == 21;// age>=21

        if (age >= 21) {
            System.out.println("Here is your Vodka");
        }
        if (age < 21) {
            System.out.println("Go drink your milk ");
        }
        int grade=60;
        if(grade>90){
            System.out.println("excellent");
        } if (grade>70 &&grade<=90){
            System.out.println("good");

        }
         if (grade>60 &&grade<=70){
            System.out.println("pass");

        }
        if (grade<=60){
            System.out.println("fail");

        }
        System.out.println("\\\\");
        System.out.println("'");
        System.out.println("\ta\tb\tc");
        System.out.println("\"\"\"");
        System.out.println("C:\nin\the downward spiral");
        System.out.println(grade%2);



    }
        }
