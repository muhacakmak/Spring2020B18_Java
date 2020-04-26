package day21_MultiDimensionalArrays;

import java.text.DecimalFormat;

public class Formatting_Decimals {
    public static void main(String[] args) {
        DecimalFormat decimalFormat=new DecimalFormat("0.000");

        double a=10.0/3.0;
        System.out.println(a);

        System.out.println(decimalFormat.format(a));
     //   DecimalFormat decimalFormat1=new DecimalFormat("0.000");
//
//        System.out.println(decimalFormat1.format(a));
//


    }
}
