package Repl_It.Methods;

import java.util.Arrays;

public class _170_Methods_with_String_5_clean_string {
    /*
    This method gets two strings (text and badWord)  and returns a string.
    basicly what it dose is take out all the occurrences of badWord in text.
    for example:
    clean ("one two three","two")
    returns "one three"
    clean ("foo bar","foo")
    returns "bar"
    clean ("he said bla bla bla","bla")
    returns "he said "
     */
    public static void main(String[] args) {

        String text = "he said bla bla bla";
        String badWord = "bla";

        System.out.println(clean(text,badWord));
    }

    public static String clean(String text, String badWord) {
          return text.replace(badWord, "");


    }

}
