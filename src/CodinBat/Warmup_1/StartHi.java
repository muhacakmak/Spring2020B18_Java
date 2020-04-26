package CodinBat.Warmup_1;

import java.util.Scanner;

public class StartHi {
    /*
    Given a string, return true if the string starts with "hi" and false otherwise.
        startHi("hi there") → true
        startHi("hi") → true
        startHi("hello hi") → false
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        Boolean result=true;
        if(str.startsWith("hi")){
            result=true;
        }else{
            result=false;
        }
        System.out.println(result);

    }
}
