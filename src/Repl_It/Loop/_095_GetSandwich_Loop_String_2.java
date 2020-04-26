package Repl_It.Loop;

import java.util.Scanner;

public class _095_GetSandwich_Loop_String_2 {
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

        Scanner scan = new Scanner(System.in);
        String str = scan.next();//breadjambread

        while (str.contains("bread")) {
            String sandwich = str.substring(str.indexOf("bread"), str.lastIndexOf("bread"));
            sandwich = sandwich.replaceFirst("bread", "");
            if (sandwich.isEmpty()) {
                System.out.println("nothing");
                break;
            } else {
                System.out.println(sandwich);
                System.exit(0);
            }
        }
        if (str.contains("bread")) {

        } else {
            System.out.println("Nothing");

        }

    }
}
