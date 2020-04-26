package Repl_It.EachLoop;

import java.util.Arrays;

public class _113_PrintEvenFrom_80_to_20_Loop {
    /*
    Write a for loop that prints all the even integers from 80 through 20 inclusive,
    separated by spaces.
    MUST USE FOR EACH LOOP
     */
    public static void main(String[] args) {
        int[] numbers = new int[81];
        int j = 80;
        int[] reverse = new int[81];
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = i;
            j--;
            reverse[j] = numbers[i];

        }

        for (int eachNumber : reverse) {
            if (eachNumber % 2 != 0 || eachNumber < 20) {
                continue;
            }
            System.out.print(eachNumber + " ");
        }


    }


}




