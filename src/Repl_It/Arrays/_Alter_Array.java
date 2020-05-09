package Repl_It.Arrays;


import java.util.Arrays;

public class _Alter_Array {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};


        int[] newArry = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                newArry[i] = a[i] / 2;
            } else {
                newArry[i] = a[i] * 10;
            }
        }





          mystery(a);

        System.out.println(Arrays.toString(a));

        for(int e : newArry)
        {
            System.out.print(e + " ");
        }
    }

    public static int[] mystery(int[] array) {
        int[] newArr = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                newArr[i] = array[i] / 2;
            } else {
                newArr[i] = array[i] * 10;
            }
        }
        return newArr;
    }

}
