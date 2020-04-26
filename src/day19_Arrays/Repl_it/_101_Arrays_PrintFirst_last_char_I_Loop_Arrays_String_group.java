package day19_Arrays.Repl_it;

public class _101_Arrays_PrintFirst_last_char_I_Loop_Arrays_String_group {
    /*
    Given a String array words, iterate through each word and print first and last
    letter of each element in separate lines.
    Example:
    words → ["hello", "why", "by", "apple" , "note"]
    print:
           ho
           wy
           by
           ae
           ne
     */
    public static void main(String[] args) {


        //                0       1    2    3       4     5       6
        String[] words = {"hello", "why", "by", "apple", "note","selcuk"};
//                       012345

       String d =""+words[0].charAt(0)+words[0].charAt(words[0].length()-1);
       String anyword="hello";
       //              01234

//        String fistAndLastLetter=anyword.substring(0,1);
//        System.out.println(fistAndLastLetter);



//        String fistAndLastLetter="";
//        for (String eachWord:words) {//
//           fistAndLastLetter= ""+eachWord.charAt(0)+eachWord.charAt(eachWord.length()-1);
//            System.out.println(fistAndLastLetter);
//
//        }
        String result="";// +ho+wy
        for (int i = 0; i <words.length; i++) {
            String word=words[i];
            String fistAndLastLetter=word.substring(0,1)+word.substring(word.length()-1);
            result+=fistAndLastLetter+"\n";

        }
        System.out.println(result);


    }
}
