package Repl_It.Arrays;

import java.util.Scanner;

public class _Assessmenttest_3_1_CarFactory {


    /*Clunker Motors Inc. is recalling all vehicles in its Extravagant line
    from model years 2010-2012 as well all vehicles in its Guzzler line from
    model years 2015-2018. A boolean variable named recalled has been declared.
Given a variable year and a String model write a statement that prints true
to recalled if the values of year and model match the recall details and prints
 false otherwise.

 */
    public static void main(String[] args) {

        int yearsExtravagant[] = {2010, 2011, 2012};

        int yearsGuzzler[] = {2015, 2016, 2017, 2018};
        Scanner scan = new Scanner(System.in);
        String model = scan.next();
        int year = scan.nextInt();
        boolean recalled = false;


        while (model.equalsIgnoreCase("Extravagant")||model.equalsIgnoreCase("Guzzler")) {
            for (int eachYearsExtravagant : yearsExtravagant) {
                if (model.equalsIgnoreCase("Extravagant") && year == eachYearsExtravagant) {
                    recalled = true;
                }

            }
            for (int eachYearsGuzzler : yearsGuzzler) {
                if (model.equalsIgnoreCase("Guzzler") && year == eachYearsGuzzler) {
                    recalled = true;

                }
            }
            System.out.println(recalled);
            System.exit(0);
        }



    }
}
