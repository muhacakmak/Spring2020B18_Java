package day18_nestedLoops.Day22;

public class NestedLoop {
    public static void main(String[] args) {


        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
        System.out.println("====================================");
        /*
         *****
         *****
         *****
         *****
         *****
         */

        int t=5;
        while (t>0){
            int z=1;
            while (z<=5){

                System.out.print("*");
                z++;
            }
            System.out.println();

            t--;
        }

        System.out.println("=====================================");

        /*
         *
         **
         ***
         ****
         *****
      */
        for (int j = 0; j <=5 ; j++) {


            for (int i = 0; i <= j; i++) {
                System.out.print("*");

            }
            System.out.println();
        }





        System.out.println("=====================================");
        /*
        ******
        *****
        ****
        ***
        **
        *

       */
        for (int j = 6; j >=1 ; j--) {
            for (int i = 1; i < j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
