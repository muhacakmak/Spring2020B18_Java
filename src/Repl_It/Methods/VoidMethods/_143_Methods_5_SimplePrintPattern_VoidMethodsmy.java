package Repl_It.Methods;

public class _143_Methods_5_SimplePrintPattern_VoidMethodsmy {
    /*
    Create a method printHollowRect that prints a 5 on 5 hollow rectangle:
*****
*   *
*   *
*   *
*****

hint:you will need to use two nested for loops for that,
and an if that checks if its the last or first iteration of
the loop (so you will know whet to print "*" or " ")
     */
    public static void main(String[] args) {
        printHollowRect();


    }

    public static void printHollowRect() {
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4) {

                    System.out.print("*");
                }


                if (j == i) {
                    System.out.print("*");
                }

            }
        }
            System.out.println();

            for (int i = 0; i <5 ; i++) {
                for (int j = 0; j <5 ; j++) {
                    if(j>3){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        }


    }

