package Repl_It.Methods.returnMethods;

import java.util.Scanner;

public class Assessment_test_5_1_Print_vowels {
    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();

        String result="";

        for (int i = 0; i <word.length() ; i++) {
            char ch=word.charAt(i);

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){

                result+=ch;

            }

        }
        System.out.println(result);




    }




}
