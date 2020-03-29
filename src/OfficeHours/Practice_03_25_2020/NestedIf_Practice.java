package OfficeHours.Practice_03_25_2020;

public class NestedIf_Practice {
    public static void main(String[] args) {

        byte weekDays = 7;
        String result = " ";
        if (weekDays > 0 && weekDays < 8) {
            if (weekDays == 1) {
                result = "Monday";
            } else if (weekDays == 2) {
                result = "Tuesday";
            } else if (weekDays == 3) {
                result = "Wednesday";
            } else if (weekDays == 4) {
                result = "Tuesday";
            } else if (weekDays == 5) {
                result = "Friday";
            } else if (weekDays == 6) {
                result = "Saturday";
            } else {
                result = "Sunday";
            }
        } else {
            result = "Invalid Entry";
        }
        System.out.println(result);
    }
}
