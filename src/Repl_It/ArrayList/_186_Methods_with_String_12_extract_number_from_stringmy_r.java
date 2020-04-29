package Repl_It.ArrayList;

import java.util.Arrays;

public class _186_Methods_with_String_12_extract_number_from_stringmy_r {
    public static void main(String[] args) {


        String s = "aa!!%$#.10aa"; // a,a,2,a,a,3




    }

    public static String extractNum(String s) {
        char[] arr = s.toCharArray();
        String result = "";
        for (int i = 0; i < s.length(); i++) {

            if (arr[i] >= 48 && arr[i] <= 57)
                result += arr[i];
        }
        return result;
    }

}
