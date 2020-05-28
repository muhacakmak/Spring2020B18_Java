package Repl_It.Arrays;

import java.util.Scanner;

public class _115_Arrays_Finding_Max_Length_in_String_array_Loopmy {
    /*
    115. Arrays - Finding Seljuk Length in String array _ Loop
      my
    Example:
    words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
    prints jaaaaavvaaaaaaaaaa
     */
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//                         0        1      2
        String[] words = {"selcuk","Tahir","EmirNamik"};

//        String fristIndx=words[0];
//        System.out.println(fristIndx);
//        int lenFistind=fristIndx.length();
//        System.out.println(lenFistind);



//        System.out.println(""+name.charAt(0)+name.charAt(5));
//
//        System.out.println(name.substring(0,1)+name.substring(name.length()-1));





//                            3

       // System.out.println(maxWord);
        //                     0        1       2
        // String[] words = {"selcuk","Tahir","Elif"};
        /*
        sk
        Tr
        Ek
         */
        String result="";
//                             3
        for (int i = 0; i <words.length ; i++) {
            String eachWord=words[i];
            String firstAndLastLetter=eachWord.substring(0,1)+eachWord.substring(eachWord.length()-1);
            result=firstAndLastLetter;//sk+Tr+Ek
            System.out.println(result);

        }












//        String max = words[0];
//        for (String eachWords:words) {
//
//            if (eachWords.length()>max.length()){
//                max=eachWords;
//            }
//
//        }
       // System.out.println(max);


    }
}
