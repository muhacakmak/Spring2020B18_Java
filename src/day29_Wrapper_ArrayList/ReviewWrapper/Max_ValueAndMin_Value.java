package day29_Wrapper_ArrayList.ReviewWrapper;

import java.util.Arrays;

public class Max_ValueAndMin_Value {
    public static void main(String[] args) {
        int maxNumOfInt = Integer.MAX_VALUE;

        System.out.println(maxNumOfInt);


        double maxNumOfDouble=Double.MAX_VALUE;
        System.out.println(maxNumOfDouble);

        int minNumInt=Integer.MIN_VALUE;
        System.out.println(minNumInt);

        byte maxNumOfByte=Byte.MAX_VALUE;
        System.out.println(maxNumOfByte);
        byte minNumOfByte=Byte.MIN_VALUE;
        System.out.println(minNumOfByte);

        System.out.println("=========================");
        int[] arr=new int[3];
        System.out.println(Arrays.toString(arr));
        double[] arrD = new double[3];
        System.out.println(Arrays.toString(arrD));
        boolean[]arrB=new boolean[3];
        System.out.println(Arrays.toString(arrB));

        Boolean[] arrBB=new Boolean[3];
        System.out.println(Arrays.toString(arrBB));
        // All of wrapper class' default values are null





    }
}
