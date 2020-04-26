package CodinBat.Warmup_1;

import java.util.Scanner;

public class frontBack {
    /*
    Given a string, return a new string where the first and last chars have been exchanged.
    frontBack("code") → "eodc"
    frontBack("a") → "a"
    frontBack("ab") → "ba"
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.next();
        if(str.length()>1){

        }else{

        }

        char first=str.charAt(0);
        char last=str.charAt(str.length()-1);

        str=last+str.substring(1,str.length()-1)+first;






    }
}
