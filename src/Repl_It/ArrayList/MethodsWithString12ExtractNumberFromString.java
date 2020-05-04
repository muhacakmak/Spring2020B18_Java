package Repl_It.ArrayList;

import java.util.Arrays;

public class MethodsWithString12ExtractNumberFromString {
    public static void main(String[] args) {
        String s = "aa2aa3";

        char[] ch = s.toCharArray();
        System.out.println(Arrays.toString(ch));
        String result = "";

        for (int i = 0; i < ch.length; i++) {
            if (Character.isDigit(ch[i])) {
                result += "" + ch[i];

            }
        }
        System.out.println(result);


    }

    public static String extractNum(String s) {
        char[] ch = s.toCharArray();
        System.out.println(Arrays.toString(ch));
        String result = "";

        for (int i = 0; i < ch.length; i++) {
            if (Character.isDigit(ch[i])) {
                result += "" + ch[i];

            }
        }
        return result;
    }

}
