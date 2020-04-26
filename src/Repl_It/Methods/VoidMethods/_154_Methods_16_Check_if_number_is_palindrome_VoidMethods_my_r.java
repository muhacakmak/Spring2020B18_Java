package Repl_It.Methods.VoidMethods;

public class _154_Methods_16_Check_if_number_is_palindrome_VoidMethods_my_r {
    public static void main(String[] args) {
        isPalindrome(12566521);

    }
    public static void isPalindrome(int num) {
        String numStr = "" + num;
        String result = "";

        for (int i = numStr.length() - 1; i >= 0; i--) {
            result += numStr.charAt(i);

        }

        boolean resultBoolean = true;
        if (numStr.equalsIgnoreCase(result)) {
            resultBoolean = true;

        } else {
            resultBoolean = false;
        }
        System.out.println(resultBoolean);
    }
}
