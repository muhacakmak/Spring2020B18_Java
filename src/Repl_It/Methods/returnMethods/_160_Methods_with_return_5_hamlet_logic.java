package Repl_It.Methods.returnMethods;

public class _160_Methods_with_return_5_hamlet_logic {
    /*
    The danish prince most famous quote is "to be or not to be". thats a classic example of boolean logic.
        the hamletQuote method only returns true if one of  or both of the boolean parameters is true.
         example:
         hamletQuote(true, false)
        returns true
        hamletQuote(false,true)
        returns true
         hamletQuote(true,true)
        returns true

        hamletQuote(false,false)
        returns false
    */
    public static void main(String[] args) {
        System.out.println(hamletQuote(false,false));

    }

    public static boolean hamletQuote(boolean toBe, boolean notToBe) {
        boolean result = false;
        result = toBe || (notToBe);

        return result;
    }
}
