package OfficeHours.Practice_03_25_2020;

public class ExplicitCasting_Practice {
    public static void main(String[] args) {
        byte bNum=100;
        short sNum=bNum;// implicit
        int iNum=200;
        short sNum2=(short) iNum;// explicit casting

        float fNum=(float) 0.5;
        System.out.println(fNum);
        float fNum2=(long)1.5;
        System.out.println(fNum2);

        long lNum1=(long) 4.5;
        System.out.println(lNum1);

        System.out.println("Take as int "+9/2);
        System.out.println("double result "+9.0/2);
        System.out.println((float) 9/2);
        System.out.println(10.0/3);










    }
}
