package Repl_It.Methods.returnMethods;

import java.util.Arrays;

public class _166_Methods_With_String_1_Merge_Them {
    /*
        When gears merge and work together, one teeth from each one goes in order.
        Write a method mergeStrings hat will return the strings merged,
         one letter at a time, starting with one.
          Please note one and two can be of different lengths. Please look at below examples:
        s1 ==> "12345"
        s2 ==> "abcde"
        mergeStrings(s1,s2) ==> "1a2b3c4d5e"
        mergeStrings("wooden", "spoon") ==> "wsopoodoenn"
        mergeStrings("java", "selenium") ==> "jsaevlaenium"
 */
    public static void main(String[] args) {

        String one = "selcuk";
        String two = "123456selc";
//        int forLoopSize = 0;
//        String leftLetters = "";
//        String result = "";
//
//
//        char[] oneArr = one.toCharArray();
//        char[] twoArr = two.toCharArray();
//
//        if (oneArr.length > twoArr.length) {
//            forLoopSize = twoArr.length;
//            leftLetters = one.substring(two.length());
//
//        } else {
//            forLoopSize = oneArr.length;
//            leftLetters = two.substring(one.length());
//        }
//
//        for (int i = 0; i < forLoopSize; i++) {
//            result += "" + oneArr[i] + twoArr[i];
//        }
//        System.out.println(result + leftLetters);
        System.out.println(mergeStrings("wooden", "spoon"));

    }

    public static String mergeStrings(String one, String two) {
        int forLoopSize = 0;
        String leftLetters = "";
        String result = "";


        char[] oneArr = one.toCharArray();
        char[] twoArr = two.toCharArray();

        if (oneArr.length > twoArr.length) {
            forLoopSize = twoArr.length;
            leftLetters = one.substring(two.length());

        } else {
            forLoopSize = oneArr.length;
            leftLetters = two.substring(one.length());
        }

        for (int i = 0; i < one.length()|| i<two.length(); i++) {
            result += "" + oneArr[i] + twoArr[i];
        }

        return result + leftLetters;








    }
    public static String mmergeStrings(String one, String two) {
        String result="";
        for(int i= 0; i<one.length() || i<two.length(); i++){
            if(i<one.length()){
                result+=one.charAt(i);
            }
            if(i<two.length()){
                result += two.charAt(i);
            }
        }
        return result;
    }
}
