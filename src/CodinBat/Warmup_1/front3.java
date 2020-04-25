package CodinBat.Warmup_1;

import java.util.Scanner;

public class posNeg {
    /*
    Given 2 int values, return true if one is negative and one is positive.
    Except if the parameter "negative" is true, then return true only if both are negative.
    posNeg(1, -1, false) → true
        posNeg(-1, 1, false) → true
        posNeg(-4, -5, true) → true
   */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        if(a<0 ||b<0){

        }else if (a>0 || b<0){

        }else if(a<0 || b>0){

        }

    }
}
