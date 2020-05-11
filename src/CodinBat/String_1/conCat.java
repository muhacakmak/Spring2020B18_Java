package CodinBat.String_1;

public class conCat {
    /*
    Given two strings, append them together (known as "concatenation") and return the result.
    However, if the concatenation creates a double-char,
    then omit one of the chars, so "abc" and "cat" yields "abcat".
    conCat("abc", "cat") → "abcat"
    conCat("dog", "cat") → "dogcat"
    conCat("abc", "") → "abc"
     */
    public static void main(String[] args) {

        System.out.println(conCat("dfgd",""));
    }

    public static String conCat(String a, String b) {
        String result = "";
         if(a.length()==0){
            result=b;
        }else if(b.length()==0){
            result=a;

        }else if (a.charAt(a.length() - 1) == b.charAt(0)) {
            result = a.substring(0, a.length() - 1)+b;
        } else {
            result = a + b;
        }
        return result;
    }

}
