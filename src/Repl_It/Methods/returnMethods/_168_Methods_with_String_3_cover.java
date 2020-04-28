package Repl_It.Methods.returnMethods;

public class _168_Methods_with_String_3_cover {
    public static void main(String[] args) {
//                     012345678910
        String main = "Java method";
        String coverMe = "met";

        String result = "";


        if (main.contains(coverMe)) {
            result = main.replace(coverMe, "[" + coverMe + "]");

        } else{
            result="["+main+"]";

        }
        System.out.println(result);


    }

    public static String coverString(String main, String coverME) {

        String result = "";


        if (main.contains(coverME)) {
            result = main.replace(coverME, "[" + coverME + "]");

        } else{
            result="["+main+"]";

        }

        return result;
    }
}
