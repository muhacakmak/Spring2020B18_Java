package day09_NestedIf_Ternary;

public class Ternary_Practice2 {
    /*
write a program that can define the age groups of a person
             age groups are:
                    baby (< 3 year)
                    Toddler (3 - 5),
                    Kid (6 - 9),
                    Pre-Teen (10 - 12),
                    Teenager (13 - 17),
                    Young Adult (18 - 20),
                    Adult (21 - 39),
                    Young Middle-Aged Adult (40 - 49),
                    Middle-Aged Adult (50 - 54),
                    Very Young Senior Citizen (55 - 64),
                    Young Senior Citizen (65 - 74),
                    Senior Citizen (75 - 84),
                    Old Senior Citizen (85+)
                    if age > 150 or less than 0 ==> invalid entry
 */
    public static void main(String[] args) {
        int age = 24;
        String ageGroup = (age < 3 && age > 0) ? "baby" : (age <= 3 && age >= 5) ? "Toddler" : (age <= 12 && age >= 10) ? "Teenager"
                : (age <= 20 && age >= 18) ? "Young Adult" : (age <= 39 && age >= 21) ? "Adult" : (age <= 49 && age >= 40) ? "Young Middle-Aged Adult"
                : (age >= 55 && age <= 64) ? "Very Young Senior Citizen" : (age >= 65 && age <= 74) ? "Young Senior Citizen"
                : (age >= 75 && age <= 84) ? "Senior Citizen" : (age >= 85 && age <= 150) ? "Old Senior Citizen" : "Invalid Entry";
        System.out.println("Age groups of a person : " + ageGroup);

        System.out.println("===================================================");
        int num1 = 300;
        int num2 = 200;
        int min = (num1 < num2) ? num1 : num2 ;
        System.out.println(min);

        System.out.println("===================================================");

        int hour =14;

        String result = (hour <= 12 ) ? "Good Morning" :(hour >12 && hour < 18) ? "Good Afternoon" : "Good Eveneing";
        System.out.println(result);

        System.out.println("===================================================");
        int number = 12000;
        boolean divisibleBy3And5 = (number % 3 ==0 && number % 5 ==0 ) ? true : false;
        System.out.println(divisibleBy3And5);

    }
}
