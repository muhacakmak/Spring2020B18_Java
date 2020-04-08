package Repl_It;

import java.util.Scanner;

public class _075Without_X_xString_Methods_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //
        String result="";
        boolean endWithX=(""+word.charAt(word.length()-1)).equalsIgnoreCase("X");
        boolean starWithX=(""+word.charAt(0)).equalsIgnoreCase("x");

        if(endWithX &&starWithX){// xHiX
                                //    0123
            result=word.substring(1,word.length()-1);
        }else if(endWithX){// javax
            result=word.substring(0,word.length()-1);
        }else if(starWithX){ //xjava
            result=word.substring(1);

        }else {
            result=word;
        }
        System.out.println(result);




    }
}
