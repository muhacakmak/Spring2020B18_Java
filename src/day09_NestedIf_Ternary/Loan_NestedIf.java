package day09_NestedIf_Ternary;

import java.util.Scanner;

public class Loan_NestedIf {
    public static void main(String[] args) {
        double salary=120000;
        byte workHistory=3;
        if(salary>=30000){
            if(workHistory>=2){
                System.out.println("You are qualified for loan");
            }else {
                System.out.println("You have been on job at least 2 years");
            }

        }else {
            System.out.println("You must earn at least $30000 ");
        }
        int x =2;
        int result=(x>=5) ? x :-x;
        System.out.println(result);

    }
}
