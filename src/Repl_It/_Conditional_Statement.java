package Repl_It;

import java.util.Scanner;

public class _Conditional_Statement {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        String result = "";
        if (word.endsWith("y")) {
            result = "-ies";
        } else if (word.endsWith("ey")) {
            result = "-eys";
        } else if (word.endsWith("ey")) {
            result = "-eys";
        } else if (word.endsWith("ife")) {
            result = "-ives";
        } else {
            result = "-s";

        }

        System.out.println(result);
    }
}
