package Repl_It.Methods;

public class _174_Methods_with_String_9_remove_first_char {
    /*
    The method gets a string and returns a string minus the first letter.
    for example:
    removeFirst("aaa")
    returns "aa"
    */
    public static void main(String[] args) {
        //             012
        String target="123456";
        System.out.println(removeFirst(target));


    }
    public static String removeFirst(String target) {

        return target.substring(1);
    }

}
