package Repl_It.Methods;

public class _172_Methods_with_String_7_at_3rd_char_grop {
    /*
     at3 gets two strings and returns a string.
     the first string is the one that will be manipulated. at the 3rd
     char position of target you will insert the word argument.
     example use:
     at3("longword","foo")
     will return: "lonfoogword"
     at3("blabla","a")
     will return: "blaabla"
   */
    public static void main(String[] args) {
        //             01234567
        String target="longword";// 3 index olan alayim +word+kalaan
        String word="foo";

        System.out.println(at3(target,word));

    }

    public static String at3(String target, String word) {

        String result=target.substring(0,3)+word+target.substring(3);

        return result;
    }

}
