package day10_Swith_Scanner;
import java.util.Scanner;
public class Number_Scanner {
    /*
     write a program that asks user to enter three numbers,
     print out the maximum and minimum number

     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1=scan.nextInt();
        System.out.print("Enter your second number: ");
        int num2=scan.nextInt();
        System.out.print("Enter your third number: ");
        int num3=scan.nextInt();

        int resultOfMax=0;
        if(num1>=num2 && num1>=num3){
            resultOfMax=num1;
        }else if(num2>=num1 && num2>=num3){
            resultOfMax=num2;
        }else {
            resultOfMax=num3;
        }
        int resultOfMin=(num1<=num2 &&num1<=num3)?num1:(num2<=num1 && num2<=num3)?num2:num3;

        System.out.println("The maximum number of "+num1+","+num2+" and "+num3+" is: "+resultOfMax);
        System.out.println("The minimum number of "+num1+","+num2+" and "+num3+" is: "+resultOfMin);

    }
}
