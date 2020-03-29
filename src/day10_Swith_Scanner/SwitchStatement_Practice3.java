package day10_Swith_Scanner;

public class SwitchStatement_Practice3 {
    public static void main(String[] args) {
        char ch = 'A';
        String result = " ";
        switch (ch) {
            case 'A':
                result += "A";
               // break;
            case 'B':
                result += "B";
                //break;
            case 'C':
                result += "C";
                //break;
            case 'D':
                result += "D";
                //break;
            default:
                result += "Invalid";
        }
        System.out.println("Result : " + result);
    }
}
