package Repl_It.Loop;

import java.util.Scanner;

public class _095_GetSandwich_Loop_String {
    /*
    A sandwich is two pieces of bread with something in between.
    Print the string that is between the first and last appearance of "bread" in
    the given string, or return string "nothing" if there are not two pieces of bread.
        Example:
        input: breadjambread
        output: jam
        Example:
        input: xxbreadjambreadyy
        output: jam
        Example:
        input: xxbreadapple
        output: nothing
        Example:
        input: breadbutterbread
        output: butter
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str = scan.next();//breadjambread
        String sandwich=str.substring(str.indexOf("bread")+5, str.lastIndexOf("bread"));
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(str.contains("bread"))&& (sandwich.isEmpty())) {
                result="noting";
                System.exit(0);
            } else {
                result=sandwich;

            }
        }
        System.out.println(result);
    }
}

