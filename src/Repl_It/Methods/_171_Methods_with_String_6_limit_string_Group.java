package Repl_It.Methods;

public class _171_Methods_with_String_6_limit_string_Group {
    /*
    This method gets a string and an int, it returns a string.
    what it dose is limit the inputted string to a cretin number of characters.
    for example:
    limit("abcd",2)
    returns "ab"
    limit("bla bla",3)
    returns "bla"
    */
    public static void main(String[] args) {

        String text = "selcuk";
        System.out.println(limit("Selcuk",2));

    }
    public static String limit(String text, int maxLength) {

        return text.substring(0, 2);

    }

}
