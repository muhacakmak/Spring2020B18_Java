package day18_nestedLoops;

public class NestedLoop2 {
    public static void main(String[] args) {
        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         */
        for (int j = 0; j <= 9; j++) {
            for (int i = 0; i <= j; i++) {

                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("========================================");

        /*

         * * * * * * * * *
         * * * * * * * *
         * * * * * * *
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *

         */

        for (int j = 0; j <= 9; j++) {

            for (int i = j; i <= 9; i++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println("===========================");

        for (int i = 0; i <=9 ; i++) {
            System.out.print("* ");

        }
        System.out.println();
        for (int i = 2; i <=9 ; i++) {
            System.out.print("* ");

        }
        System.out.println();
        System.out.println("================================");
        /*
        a
        a b
        a b c
        a b c d
         */

        for (char zh = 'a'; zh <'z' ; zh++) {
            for (char ch = 'a'; ch <=zh ; ch++) {
                System.out.print(ch+" ");
            }
            System.out.println();

        }

    }
}



