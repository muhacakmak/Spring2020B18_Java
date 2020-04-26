package Repl_It.Methods.VoidMethods;

import java.util.Scanner;

public class _139_Methods_1_simpleCalculator_VoidMethods_my_repls {
    public static void main(String[] args) {
        plus();

    }
    public static void plus(){
        Scanner input=new Scanner(System.in);

        int firstNumber=input.nextInt();

        int secondNumber = input.nextInt();

        System.out.println("result: "+firstNumber+secondNumber);



    }


}
