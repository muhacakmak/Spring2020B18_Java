package day10_Swith_Scanner;

public class SwitchStatement_Practice {
    public static void main(String[] args) {
        int number=8;
        String result=" ";
        switch (number){
            case 1:
                result="Monday";

            case 2:
                result="Tuesday";

            case 3:
                result="Wednesday";
                break;
            case 4:
                result="Thursday";
                break;
            case 5:
                result="Friday";
                break;
            case 6:
                result="Saturday";
                break;
            default:
                result="Invalid entry";
            case 7:
                result="Sunday";
                break;
        }
        System.out.println(result);
    }
}
