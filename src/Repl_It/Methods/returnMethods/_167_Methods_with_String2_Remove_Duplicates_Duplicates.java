package Repl_It.Methods.returnMethods;

public class _167_Methods_with_String2_Remove_Duplicates_Duplicates {
    public static void main(String[] args) {
    String str="BugBusters";
    String result1= uniqueChars(str);
    System.out.println(result1);
}
    public static String uniqueChars(String str) {
        String result="";

        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if (!result.contains("" + ch)) {
                result += ch;
            }

        }
        return result;

    }
}
