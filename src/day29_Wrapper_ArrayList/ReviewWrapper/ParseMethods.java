package day29_Wrapper_ArrayList.ReviewWrapper;

public class ParseMethods {
    public static void main(String[] args) {
        String str = "123";

        int a1 = Integer.parseInt(str);// 123
        System.out.println(str + 1);//text
        //                  "123"+1==>> 1231
        System.out.println(a1 + 1);// number
        // >>              124 + 1 =>> 124


        byte b1=Byte.parseByte(str); // none
        System.out.println(b1+1);

        Integer I1=(int)b1;  //Auto boxing



        String str2="10.5";
        float f1=Float.parseFloat(str2);// float 10.5
        System.out.println(f1+1);

        double d1=Double.parseDouble(str2);
        System.out.println(d1+1);



        String str3="3147483647";

        long num1=Long.parseLong(str3);//auto boxing,

        System.out.println(num1+2);


        Long L1=num1;
        System.out.println(L1+2);

        String result1="TRuE";
        // any string other than "true" will ALWAYS return false, not case sensitive

        boolean r1=Boolean.parseBoolean(result1);// boolean
        System.out.println(r1);

        String result2="fAlse";
        boolean r2=Boolean.parseBoolean(result2);
        System.out.println(r2);

















    }
}
