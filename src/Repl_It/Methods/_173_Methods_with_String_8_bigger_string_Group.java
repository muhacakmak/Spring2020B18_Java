package Repl_It.Methods;

public class _173_Methods_with_String_8_bigger_string_Group {

    /*
    the method gets two strings and return the longest one
    biggerS("apple","orange") ==> "orange"
     */
    public static void main(String[] args) {
        System.out.println(biggerS("Zeynep","ayna"));
    }

    public static String biggerS(String a, String b) {

        int aLength = a.length();
        int bLength = b.length();
        if (aLength > bLength) {
            return a;
        } else {
            return b;
        }
    }
}
