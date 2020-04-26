package day20_ArraysContinue;

import java.util.Arrays;

public class Array_Size {
    public static void main(String[] args) {
        int [] arr1={1,2,3};
        int [] numS= new int[2];//{0,0}
        numS[0]=10;
        numS[1]=20;
        System.out.println(Arrays.toString(numS));//[10,20]

        //num[2]=30; arry's size is fixed
        numS=new int[3];
        System.out.println(Arrays.toString(numS));//[0,0,0] reset
    }
}
