package day09_NestedIf_Ternary;

public class Ternary_Practice {
    public static void main(String[] args) {
        int number = 100;
        char ch1 = ' ';
        if (number > 0) {
            ch1 = '+';
        } else if (number < 0) {
            ch1 = '-';
        } else {
            ch1 = '0';
        }
        System.out.println(number + " is " + ch1);
        char ch2 = (number > 0) ? '+' : (number < 0) ? '-' : '0';
        System.out.println(number + " is " + ch2);
        System.out.println("============================");
        byte score=70;
        String grade=(score>=90 && score <=100)? "Excellent":(score>=80 && score <90)?"Great":(score>=70 && score <80)?"Good"
                :(score>=60 && score <70)?"Pass":(score>0 && score <60)?"Failed":"Invalid";
        System.out.println("Grade = "+grade);
    }
}
