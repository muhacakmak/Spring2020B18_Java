package Repl_It.Methods;

public class _179_Methods_with_String_11_reverse_string {
    /*
   reverse method reverse a string.
   it gets a string and returns it in reverse.
   for example:
   reverse("foo") ==> "oof"
    reverse("student") ==> "tnedust"
    */
    public static void main(String[] args) {
        String input="Elif";

        System.out.println(reverse(input));



    }

    public static String reverse(String input) {
        String reverse="";
        for (int i =input.length()-1;i>=0; i--) {
            reverse+=input.charAt(i);
        }
        return reverse;
    }
}
