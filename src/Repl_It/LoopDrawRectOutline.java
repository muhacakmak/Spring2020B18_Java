package Repl_It;

import java.util.Scanner;

public class LoopDrawRectOutline {
    /*
                you get a number, write a code that draws a rectangle outline the size of that number.
            each rectangle row is 3 x: xxx
            inner rectangle row is "x  x"
           for example:
            n = 2
            xxx
            x  x
            x  x
            xxx
            n=3
           xxx
            x  x
            x  x
            x  x
            xxx
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();


        System.out.println("xxx");
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <1 ; j++) {
                System.out.println("x x");
            }

        }
        System.out.println("xxx");



    }
}
