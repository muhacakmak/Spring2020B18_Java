package day16_ForLoop.Warmup;

public class Alphabets {
    //  Aa Bb Cc Dd  ...
    public static void main(String[] args) {

        String upperCase = " ";
        String lowerCase = " ";

        for (char i = 'A'; i <= 'Z'; i++) {
            upperCase += i;

        }
        System.out.println(upperCase);

        for (char ch = 'a'; ch <= 'z'; ch++) {
            lowerCase += ch;

        }

        String result = "";
        for (int i = 0; i <= lowerCase.length() - 1; i++) {
            result += "" + upperCase.charAt(i) + lowerCase.charAt(i) + " ";

        }
        System.out.println(result);

        // second solution

        int a=97;
        int A=65;

        String result2="";


        for (int i = 0; i <26 ; i++) {
            char upper=(char)(A+i);
            char lower=(char)(a+i);

           result2+=""+upper+lower+" ";

        }
        System.out.println(result2);

    }
}
