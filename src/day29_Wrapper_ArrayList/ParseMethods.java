package day29_Wrapper_ArrayList;

public class ParseMethods {
    public static void main(String[] args) {


        String str = "123";

        System.out.println(str + 1);
        System.out.println(1 + 2);

        int a1 = Integer.parseInt(str);// 123
        System.out.println(a1);


        System.out.println(str + 1);
        //                  "123"+1==> "1231"
        System.out.println(a1 + 1);
        //                 123+1===> 124

        byte b1 = Byte.parseByte(str);// byte =123
        System.out.println(b1 + 1);

        Integer I1 = (int) Byte.parseByte(str);// AutoBoxing


        String str2 = "10.5";
        float f1 = Float.parseFloat(str2);// float 10.5
        System.out.println(f1 + 1);
        double f2=Double.parseDouble(str2);
        System.out.println(f2+1);



        String str3="3147483647";
        long num1=Long.parseLong(str3); // autoBoxing
        System.out.println(num1);
//
////        Long num2=Long.parseLong(str2);
////        System.out.println(num2);
//
//        String result1="Muhtar";
//
//        boolean r1=Boolean.parseBoolean(result1);// boolean
//
//       System.out.println(r1);
//        String result="9>7";
//
//        boolean r2=Boolean.parseBoolean(result);
//        System.out.println(r2);
//
//
//        String result2="fALsE";// "false"
//
//        boolean r3=Boolean.parseBoolean(result2);
//        System.out.println(r3);
//
//
//
//
//


    }
}