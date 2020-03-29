package day09_NestedIf_Ternary;

public class ageGroups {
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
        String ageGroup = " ";
        if (age < 3 && age > 0) {
            ageGroup = "baby";
        } else if (age <= 3 && age >= 5) {
            ageGroup = "Toddler";
        } else if (age <= 9 && age >= 6) {
            ageGroup = "Kid";
        } else if (age <= 12 && age >= 10) {
            ageGroup = "Pre-Teen";
        } else if (age <= 17 && age >= 13) {
            ageGroup = "Teenager";
        } else if (age <= 20 && age >= 18) {
            ageGroup = "Young Adult";
        } else if (age <= 39 && age >= 21) {
            ageGroup = "Adult";
        } else if (age <= 49 && age >= 40) {
            ageGroup = "Young Middle-Aged Adult";
        } else if (age >= 55 && age <= 64) {
            ageGroup = "Very Young Senior Citizen";
        } else if (age >= 65 && age <= 74) {
            ageGroup = "Young Senior Citizen";
        } else if (age >= 75 && age <= 84) {
            ageGroup = "Senior Citizen";
        } else if (age >= 85 && age <= 150) {
            ageGroup = "Old Senior Citizen";
        } else {
            ageGroup = "Invalid Entry";
        }
        System.out.println(ageGroup);

        boolean eligibleToBuy =  ageGroup == "Adult" || ageGroup == "Young Middle-Aged Adult" ||
                ageGroup == "Middle-Aged Adult";

        if(eligibleToBuy){
            System.out.println("You are eligible");
        }else {
            System.out.println("You are not eligible");
        }
    }
}
