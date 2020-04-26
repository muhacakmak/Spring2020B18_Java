package Repl_It.Methods.returnMethods;

public class _167_Methods_with_String2_Remove_Duplicates_Duplicates_2 {
    public static void main(String[] args) {
    String str="java";

   uniqueChars(str);
        System.out.println(uniqueChars(str));
}
    public static String uniqueChars(String str) {
        String result="";

        for (int j = 0; j <str.length() ; j++) {
            int count=0;

            for(int i=0;i<str.length();i++) {
                char ch=str.charAt(i);
                if(ch==str.charAt(j)){
                    count++;
                }

            }
            if (count == 1) {
                result += str.charAt(j);
            }

        }

        return result;

    }
}
