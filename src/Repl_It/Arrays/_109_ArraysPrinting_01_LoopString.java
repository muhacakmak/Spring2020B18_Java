package Repl_It.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _109_ArraysPrinting_01_LoopString {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];

        for (int i=0;i<arr.length;i++)
        {
            arr[i] = input.nextLine();

        }
        String result = "";

            for (int i = 0; i < arr.length; i++) {
                result += arr[i].substring(0, 3)+"\n";
            }

            System.out.println(result);
        }


    }

