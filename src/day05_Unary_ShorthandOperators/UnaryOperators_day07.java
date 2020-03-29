package day05_Unary_ShorthandOperators;

public class UnaryOperators_day07 {
    public static void main(String... arr) {
        /*
        +: positive
        -: negative
        ++: increment
        --: decrement
        + -: ===> -
        - - :===> +
        + + :===> +

         */

        int a = 10;
        int b = -10;
        System.out.println(b);
        int c = +b; // - + ==>-
        System.out.println(c);
        int d = -c;
        System.out.println(d);

        // increment
        // a pre increment: operator is placed
        // before the variable;

        int num1=100;

        System.out.println(++num1); // num1 +1

        int num2=++num1;
        System.out.println(num2);

        // post increment operator after the variables
        int IntNum=100;
        System.out.println(IntNum++);
        System.out.println(IntNum);

        int IntNum2=IntNum++;
        System.out.println(IntNum2);
        System.out.println(IntNum);


        //Decrement:decreses
















    }
}
