package Repl_It.EachLoop;

import java.util.Scanner;

public class Arrays_Print_First_last_char_I {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        String firstAndLastLetter = "";
        for (String eachWords:words){

            firstAndLastLetter=eachWords.substring(0,1)+eachWords.substring(eachWords.length()-1);
            System.out.println(firstAndLastLetter);

        }

    }
}
