package Repl_It.Arrays;

import java.util.Scanner;

public class _101_Arrays_PrintFirst_last_char_I_Loop_Arrays_String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        String firstAndLastLetter = "";

        for (int i = 0; i < words.length; i++) {

            firstAndLastLetter=words[i].substring(0,1)+words[i].substring(words[i].length()-1);
            System.out.println(firstAndLastLetter);


        }


    }
}
