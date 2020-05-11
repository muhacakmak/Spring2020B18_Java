package Repl_It.Arrays;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class _Arrays_Diving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] arr = new float[7];
        float sum = 0;
        float difficulty = 0;
        String total = "";
        DecimalFormat df = new DecimalFormat("0.00");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter score for judge " + (i + 1) + ":");
            arr[i] = input.nextFloat();
            sum += arr[i];
        }
        Arrays.sort(arr);

        sum = sum - arr[0] - arr[arr.length - 1];
        System.out.println("Enter difficulty:");
        difficulty = input.nextFloat();
        total = df.format(sum * difficulty * 0.6);
        System.out.println("Total: %.2f " + total);
    }
}
