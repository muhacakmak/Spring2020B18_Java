package Repl_It.Methods;

public class _172_Methods_with_String_7_at_3rd_char {
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
        System.out.println(at3("longword", "foo"));


    }

    public static String at3(String target, String word) {
        return target.substring(0, 3) + word + target.substring(3);
    }
}
