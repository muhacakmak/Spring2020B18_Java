package day29_Wrapper_ArrayList;

import java.util.Arrays;

public class ValueOfMethods {
    public static void main(String[] args) {
        String str = "123";
        Integer a = Integer.valueOf(str);

        System.out.println(a);


        double b = Integer.valueOf(str);// unboxing
        // double =Integer

        System.out.println(b);

        String str2 = "15.5";

        double d1 = Double.parseDouble(str2);//
        // double = double

        System.out.println(d1);

        double d2 = Double.valueOf(str2);
        //      double=Double // unboxing
        System.out.println(d2);
        System.out.println(d1 == d2);


        System.out.println("==================================");
        int z1=2000;
      //  Long L1=z1;  does not accept any other primitives except Long


        String r1="true";
        Boolean t1=Boolean.valueOf(r1);
        //  boolean =boolean    // none

        boolean t2=Boolean.valueOf(r1);
        // boolean =Boolean // unboxing


        System.out.println(t1);
        System.out.println(t2);

        System.out.println("===============================");

        int maxNum=Integer.MAX_VALUE;
        System.out.println(maxNum);
        double maxNum2=Double.MAX_VALUE;
        System.out.println(maxNum2);

        int minNum=Integer.MIN_VALUE;
        System.out.println(minNum);

        byte maxNumByte=Byte.MAX_VALUE;
        System.out.println(maxNumByte);


        byte minNumberByte=Byte.MIN_VALUE;
        System.out.println(minNumberByte);
        char minNumberChar=Character.MIN_VALUE;
        System.out.println(minNumberChar);
        int bb=minNumberChar;
        System.out.println(bb);

        System.out.println("===========================");
        boolean [] arr=new boolean[3] ;
        System.out.println(Arrays.toString(arr));
        Character [] arr2=new Character[3];
        System.out.println(Arrays.toString(arr2));
        Integer [] arr3=new Integer[3];
        System.out.println(Arrays.toString(arr3));






    }
}
