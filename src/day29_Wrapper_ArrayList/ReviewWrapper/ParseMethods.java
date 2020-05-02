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













    }
}
