package Repl_It.Methods;

public class _173_Methods_with_String_8_bigger_string {

    /*
    the method gets two strings and return the longest one
    biggerS("apple","orange") ==> "orange"
     */
    public static void main(String[] args) {
        System.out.println(biggerS("selcuk","Emir"));


    }

    public static String biggerS(String a, String b) {
        if (a.length() > b.length()) {
            return a;
        } else {
            return b;
        }
    }
}
