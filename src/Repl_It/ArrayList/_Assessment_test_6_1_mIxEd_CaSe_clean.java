package Repl_It.ArrayList;

import java.util.Scanner;

public class _Assessment_test_6_1_mIxEd_CaSe_clean {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        s = s.toLowerCase();

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                result += s.substring(i, i + 1).toLowerCase();
            }
           else {
                result += s.substring(i , i + 1).toUpperCase();
            }

        }
        System.out.println(result);
    }
}
