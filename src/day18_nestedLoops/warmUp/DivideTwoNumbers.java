package day18_nestedLoops.warmUp;

public class DivideTwoNumbers {
    /*
    1. write a program that can divide two numbers.
			NOTE: DO NOT USE division, multiplication, or module operators

     */
    public static void main(String[] args) {

        int a = 20;
        int b = 3;
        int count = 0;
        if (b == 0) {
            System.out.println("Divisor cannot be zero");
            System.exit(0);
        }

        while (a >= b) {
            a -= b;
            count++;
        }
        if (a == 0) {

            System.out.println("The result is " + count);
        } else {
            System.out.println("The result is " + count + " with a remainder of " + a);
        }


    }
}
