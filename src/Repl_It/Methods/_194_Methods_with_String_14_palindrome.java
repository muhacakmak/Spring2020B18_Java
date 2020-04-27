package Repl_It.Methods;

public class _194_Methods_with_String_14_palindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome("Nurses Run"));

    }

    public static boolean isPalindrome(String check) {
        String reverse = "";
        check=check.replace(" ","");
        for (int i =check.length()-1;i>=0; i--) {
            reverse+=check.charAt(i);
        }
        if(check.equalsIgnoreCase(reverse)){
            return true;
        }else {
            return false;
        }
    }

}
