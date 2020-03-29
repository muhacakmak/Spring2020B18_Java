package Task;

import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter seconds: ");
//        int inputSeconds = input.nextInt();
//        int hours = (inputSeconds/60)/60;
//        int minutes = (inputSeconds/60)%60;
//        int seconds = (inputSeconds%60);
//        System.out.println(hours+" hours, "+minutes+" minutes, and "+seconds+" seconds");
        System.out.println("Enter 3 digit number: ");
        int num= input.nextInt();
        int num1, num3;
        num1 = num % 10;
        num3 = ((num/100));
        if((num % 99 != 0) && (num / 1000 == 0)) {
            if (num1 == num3) {
                System.out.println("It's palindrome");
            } else if (num1 != num3) {
                System.out.println("It's not palindrome");
            }
        }else{
            System.out.println("It's not 3 digit numner");
        }
    }
}


