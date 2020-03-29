package day09_NestedIf_Ternary.nestIf_day12;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter your score : ");
        double grade=scan.nextDouble();
        char result=' ';
        if(grade>=0 && grade<=100){
            if(grade>=60) {
                if (grade > 90) {
                    result = 'A';
                } else if (grade >= 80) {
                    result = 'B';
                } else if (grade >= 70) {
                    result = 'C';
                } else {
                    result = 'D';
                }

            }else {
                System.out.println("failed");
                result='F';
            }
            System.out.println("Your grade : "+ result);

        }else {
            System.out.println("Not valid entry");
        }


    }
}
