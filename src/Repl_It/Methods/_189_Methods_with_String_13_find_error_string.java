package Repl_It.Methods.VoidMethods;

public class _189_Methods_with_String_13_find_error_string {
    /*
    isError method checks if the line of string it gets has the word error at the start of it.
    it gets a string and returns a boolean.
    true if it found the word 'error' an the start of the line string
    example use:
    isError("foo bar")
    returns : false

    isError("error foo bar")
    returns : true
     */
    public static void main(String[] args) {
        String line="error one two";
        System.out.println(isError(line));


    }

    public static boolean isError(String line) {
        boolean result=true;
            if(line.startsWith("error")){
                result=true;
            }else {
                result=false;
            }
        return result;
    }
}
