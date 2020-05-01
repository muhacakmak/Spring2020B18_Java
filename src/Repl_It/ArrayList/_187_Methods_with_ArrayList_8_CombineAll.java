package Repl_It.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class _187_Methods_with_ArrayList_8_CombineAll {
    public static void main(String[] args) {
        ArrayList <String> wordList1 = new ArrayList <>();
        wordList1.add("Selcuk");
        wordList1.add("Elif");
        ArrayList <String> wordList2 = new ArrayList <>();
        wordList2.add("Emir");
        wordList2.add("Tahir");
        System.out.println(combineAL(wordList1, wordList2));

    }

    public static ArrayList <String> combineAL(ArrayList <String> wordList1, ArrayList <String> wordList2) {
        // first solution

//        ArrayList <String> combineAL = new ArrayList <>();
//        for (String each : wordList1) {
//            combineAL.add(each);
//        }
//        for (String each : wordList2) {
//            combineAL.add(each);
//        }
//        return combineAL;



        // Second solution


        ArrayList <String> combineArrays = new ArrayList <>();

        combineArrays.addAll(wordList1);
        combineArrays.addAll(wordList2);


        return combineArrays;
    }


}
