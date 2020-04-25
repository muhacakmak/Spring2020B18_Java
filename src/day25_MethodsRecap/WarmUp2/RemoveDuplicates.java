package day25_MethodsRecap.WarmUp2;

public class task1_RemoveDuplicate {
    public static void main(String[] args) {
        String str2="ABCABCABC";
        String result2=removeDuplicate(str2);
        System.out.println(result2);


    }

    public static String removeDuplicate(String str) {


        String result = "";// A

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!result.contains("" + ch)) {
                result += ch;
            }
        }
        return result;
    }
}
