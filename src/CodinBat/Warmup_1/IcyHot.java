package CodinBat.Warmup_1;

import java.util.Scanner;

public class IcyHot {
    /*
    Given two temperatures, return true if one is less than 0 and the other is greater than 100.
     icyHot(120, -1) → true
    icyHot(-1, 120) → true
    icyHot(2, 120) → false
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int temp1=input.nextInt();
        int temp2=input.nextInt();

        boolean result=true;
        if((temp1>100 && temp2<0)||(temp1<0 && temp2>100)){
            result=true;

        }else {
            result=false;
        }
        System.out.println(result);







    }
}
