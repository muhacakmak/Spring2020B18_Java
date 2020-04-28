package Repl_It.Methods;

import java.util.Arrays;

public class _195_Methods_with_String_15_anagram_Emrah {
    public static void main(String[] args) {

        String word1="earth";
        String word2="earth";
        System.out.println(isAnagram(word1,word2));

    }
    public static boolean isAnagram(String word1, String word2) {
        word1=word1.toLowerCase();
        word2=word2.toLowerCase();
        char [] word1Arr=word1.toCharArray();
        Arrays.sort(word1Arr);

        char [] word2Arr=word2.toCharArray();
        Arrays.sort(word2Arr);
        if(Arrays.equals(word1Arr,word2Arr)){
            return true;
        }else {
            return false;
        }

    }
}
