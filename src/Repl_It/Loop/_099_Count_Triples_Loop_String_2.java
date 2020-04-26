package Repl_It.Loop;

public class _099_Count_Triples_Loop_String_2 {
    /*
    We'll say that a "triple" in a string is a char appearing three
    times in a row. Print out the number of triples in the given string.
     The triples may overlap.

Example:
input: abcXXXabc
output: 1

Example:
input: xxxabyyyycd
output: 3

Example:
input: java
output: 0
     */
    public static void main(String[] args) {

        String str = "122abhhh2";//s

        int count=0;
        for (int i = 0; i <= str.length() - 3; i++) {
            char tree = str.charAt(i);
            if ((tree == str.charAt(i + 1)) && (tree == str.charAt(i + 2))) {
                count++;
            }

        }
        System.out.println(count);
    }
}


