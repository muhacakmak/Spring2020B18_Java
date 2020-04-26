package Repl_It.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysConvertBinaryToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] binary = new int[8];
        for (int i = 0; i < binary.length; i++) {
            binary[i] = input.nextInt();

        }
        int result=0;
        int j=128;
        for (int eachBinary:binary) {
                result+=eachBinary*j;//  1+
            j/=2;
        }
        System.out.println(result);
    }
}