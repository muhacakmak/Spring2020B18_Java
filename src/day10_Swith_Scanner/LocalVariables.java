package day10_Swith_Scanner;

public class LocalVariables {
    public static void main(String[] args) {
        // declare variable : DataType variableName;
        int a = 0;
        if (true) {
            System.out.println(a);
            int b = 10;
        }
        //  System.out.println(b);
        switch (4) {
            case 1:
                int c = 100;
            case 2:
                // System.out.println(c); // local variable c belongs the case block 1
        }
        if (9 > 10) {
            int t = 100;
        } else if (11 > 10) {
            int t = 200;
        } else if (12 > 10) {
            int t = 300;
        }
       // System.out.println(t);

    }
}
