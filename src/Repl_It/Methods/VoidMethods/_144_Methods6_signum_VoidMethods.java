package Repl_It.Methods.VoidMethods;

import java.util.Scanner;

public class _144_Methods6_signum_VoidMethods {
    /*
    a sign function is simple, its gets a number and tells you if its positive, negative or zero.

        for example :
        sign(5)  => 1
        sign(-30)=> -1
        sign(0)  => 0

        sign gets an int parameter.

        print out 1,-1 or 0 depending on the input
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        sign(n);

    }
    public static void sign(int n) {
        int result=0;

        if(n>0){
            result=1;
        }else if(n<0){
            result=-1;
        }else {
            result=0;
        }

        System.out.println(result);



    }



}
