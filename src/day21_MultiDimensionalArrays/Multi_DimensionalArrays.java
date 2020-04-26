package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class Multi_DimensionalArrays {
    public static void main(String[] args) {

        int [] arr={1,2,3};

        int[][]arr2D={{1,2,3},{4,5,6,7},{40,3},arr};
        System.out.println(arr2D.length);

        int[] arr1D=arr2D[0];

        System.out.println(Arrays.toString(arr2D[1]));

        int num1=arr2D[1][3];


        char[][] ch2D={ {'A','B'},{'D','E','F'},{'G','H','J'}};

        char D=ch2D[1][0];
        char[]ch2=ch2D[2];
        System.out.println(Arrays.toString(ch2));

        //                 0   1   2     0   1   2     0   1   2
        String[][]str2D={{"A","B","C"},{"D","E","F"},{"J","H","I"}};
        //                    0               1           2
        //








    }
}
