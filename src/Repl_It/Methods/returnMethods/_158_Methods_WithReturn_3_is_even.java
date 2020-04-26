package Repl_It.Methods.returnMethods;

public class _158_Methods_WithReturn_3_is_even {
    /*
    isEven method gets a number(int) if its even (2,4,8...) returns true.
    if its odd return false.

    for example:

    isEven(1) --> false

    isEven(8) --> true
     */

    public static void main(String[] args) {
        System.out.println(isEven(2));

    }
    public static boolean isEven(int n){
        boolean result=true;
        if(n%2==0){
            result=true;
        }else{
            result=false;
        }
        return result;

    }

}

