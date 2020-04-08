package Repl_It;

import java.util.Scanner;

public class _064_MiddleOne_StringMethods {
    /*
     You have a word, do the following:
1. When word has odd number of characters and:
            - 3 or more characters, print middle letter
      oak ==> a
      javav ==> v
             - Single character, print that character 3 times
      # ==> ###
      q ==> qqq
2. When word has even number of characters and:
           - 4 or more characters, print middle 2
     java ==> av
     apples ==> pl
     #$%^&* ==> %^
           - 2 characters, print those 2 characters twice
      @@ ==>@@@@
      $$ ==>$$$$
      hi ==> hihi
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String result="";

        if(word.length()>=3 && word.length()%2!=0){
            result=word.substring(word.length()/2, word.length()/2+1);
        }else if(word.length()==1){
            result=word+word+word;

        }else if(4<=word.length()&&word.length()%2==0) {
            result = word.substring(word.length() / 2 - 1, word.length() / 2 + 1);

        }else {
            result=word+word;

        }
        System.out.println(result);



    }
}
