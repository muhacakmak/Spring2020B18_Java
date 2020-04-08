package Repl_It;

import java.util.Scanner;

public class _075Without_X_xString_Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String result="";


        boolean endWithX = ("" + word.charAt(word.length() - 1)).equalsIgnoreCase("x");
        boolean startWithX=(""+word.charAt(0)).equalsIgnoreCase("X");
        if(startWithX&& endWithX){
            result= word.substring(1,word.length()-1);

        }else if(startWithX){
            result=word.substring(1);;

        }else if(endWithX) {
            result=word.substring(0,word.length()-1);
        }else {
            result=word;
        }
        System.out.println(result);


    }
}
