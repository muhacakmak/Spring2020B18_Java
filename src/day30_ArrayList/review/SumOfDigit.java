package day30_ArrayList.review;

public class SumOfDigit {
    /*
     1. write a program that can return the sum of all the digits from a string
            Pizza:
                input: "a1b2c3"
                output: 6
                    (1+2+3= 6)
                input: "Today's date is 04/27/2020"
                output: 17
                    (0+4+2+7+2+0+2+0=17)
            HINT: on ascii table, the characters between #48 ~ #57 are digits

        */

    public static void main(String[] args) {
        String str = "Today's date is 04/27/2020";

        char[] strArr = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < strArr.length; i++) {
            boolean isDigit = strArr[i] >= 48 && strArr[i] <= 57;
            if (isDigit) {
                sum += Integer.parseInt("" + strArr[i]);

            }
        }
        System.out.println(sum);
        int sum2 = 0;
        System.out.println("=================================");
        for (char each : strArr) {
            if (Character.isDigit(each)) {
                sum2 += Integer.parseInt("" + each);
            }

        }

        System.out.println(sum2);

        boolean a=Character.isAlphabetic('A');
        System.out.println(a);



    }
}
