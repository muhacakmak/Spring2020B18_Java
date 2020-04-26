package CodinBat.Warmup_1;

import java.util.Scanner;

public class notString {
    /*
    Given a string, return a new string where "not " has been added
    to the front. However, if the string already begins with "not",
    return the string unchanged. Note: use .equals() to compare 2 strings.
    notString("candy") → "not candy"
    notString("x") → "not x"
    notString("not bad") → "not bad"
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String str=input.nextLine();
        String result="";

        if((str.startsWith("not"))){
            result=str;

        }else{
            result="not "+str;
        }
        System.out.println(result);
    }
}
