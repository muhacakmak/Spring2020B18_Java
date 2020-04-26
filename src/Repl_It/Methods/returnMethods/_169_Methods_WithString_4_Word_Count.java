package Repl_It.Methods.returnMethods;

import java.util.Arrays;

public class _169_Methods_WithString_4_Word_Count {
    /*
    Instructions from your teacher:
    This method gets a string and returns the word count of that string.

    example:

    wordCount("foo bar")
    returns 2

    wordCount("one two three")
    returns 3

    wordCount("bla")
    returns 1

    hint:
     */
    public static void main(String[] args) {

        String words = "one";
        int count=wordCount(words);
        System.out.println(count);
    }

    public static int wordCount(String words) {
        String[] arrWords = words.split(" ");
        int wordsCount = arrWords.length;
        return wordsCount;
    }
}
