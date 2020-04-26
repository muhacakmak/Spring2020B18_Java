package day19_Arrays.Repl_it;

import java.util.Arrays;
import java.util.Scanner;

public class _115_Arrays_Finding_Max_Length_in_String_array_Loopmy {
    /*
    Given the array words, it will print the word with the largest length. Assume that there are no 2 words with longest length
    Example:
    words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
    prints jaaaaavvaaaaaaaaaa
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];// selcuk,turkan,elif,tahir,emir
        //                                  0      1    2     3     4

//               0 1 2 3 4     5
       // System.out.println(Arrays.toString(words));
        for(int i = 0; i < words.length;  i++) {

            words[i] = input.nextLine();

        }
        System.out.println(Arrays.toString(words));
        // String words[]={selcuk,turkan,elif,tahir,emir};
        //                  0      1      2    3     4
        String uzunIsim="";
        //                     5
        for (int i = 0; i <words.length ; i++) {

            String eacName=words[i];
            if(eacName.length()>uzunIsim.length()){
                uzunIsim=eacName;//selcuk,
            }


        }










    }
}
