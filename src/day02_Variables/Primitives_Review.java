package day02_Variables;

public class Primitives_Review {
    public static void main(String[] args) {

        byte bNum=127;
        // byte range : -128 to 127

        //byte bNum2= 123.5;// byte only takes whole number
        //short sNum=125.5;// onyl takes  whole number
        short sNum2=1000;
      //  byte bNum2=sNum2; can not because short>byte

      sNum2=bNum;
        System.out.println(sNum2);

    }
}
