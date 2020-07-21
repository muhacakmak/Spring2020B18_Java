package day24_Methods.WarmUpTask_return;

public class MaxNumber {


    /*
     1. write a methods that can return the maximum number between two numbers
    Ex: Seljuk(10, 20) ==> 20
     */
    public static void main(String[] args) {

int a=maxNumber(5,3);
        System.out.println(a+5);

    }

    public static int maxNumber(int num1, int num2) {
        if (num1 > num2) {
          //  System.out.println("Maximum number is: " + num1);
            return num1;
        } else {
          //  System.out.println("Maximum number is: " + num2);
            return num2;
        }

    }
}




