package CodinBat.Warmup_1;

import java.util.Scanner;

public class in1020 {
    /*
    Given 2 int values, return true if either of them is in the range 10..20 inclusive.
      in1020(12, 99) → true
        in1020(21, 12) → true
        in1020(8, 99) → false
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        boolean result=true;
        if((a>=10 && a<=20) || (b<=20 &&b >=10)){
            result=true;

        }else {
            result=false;
        }



    }
}
