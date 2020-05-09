package Repl_It.OPP;


import java.util.Arrays;


public class SwitchElements {
    public static void main(String[] args) {

        int[] i = {1, 2, 3, 4, 5, 8, 9,25,36,2,3,5};
//        //            1   2  3  4  5  6
//
//        int[] arr=new int[i.length];
//        //                    7-1
//        for (int j = 1; j <arr.length-1 ; j++) {
//            arr[0]=i[i.length-1];
//            arr[j]=i[j];
//            arr[arr.length-1]=i[0];
//        }

        System.out.println(Arrays.toString( do_switch(i)));


    }

    public static int[] do_switch(int[] i) {
        int[] arr = new int[i.length];
        for (int j = 1; j < arr.length - 1; j++) {
            arr[0] = i[i.length - 1];
            arr[j] = i[j];
            arr[arr.length - 1] = i[0];
        }
        return arr;

    }
}
