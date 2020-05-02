package day29_Wrapper_ArrayList.ReviewWrapper;

public class ValueOfMethods {
    public static void main(String[] args) {
        String str = "123";
        Integer a = Integer.valueOf(str);//none


        System.out.println(a);
        double b = Integer.valueOf(str); // unboxing
        // double =Integer
        System.out.println(b);
        String str2 = "15.5";

        double d=Double.parseDouble(str2);
        // double =double     none

        double d2=Double.valueOf(d);
        //    double =Double    >>>   unboxing

        System.out.println(d);
        System.out.println(d2);
        System.out.println(d==d2);
        System.out.println("=================================");
        int z1=2000;
        //Long L1=z1;  does not accept any other primitives except for long

        Short sh1=300;
        int z2=sh1;

        /*
        "True"
        "Fase"
        "1000000.5"
        "123456"

         */
       String s1="True";
       Boolean b1=Boolean.valueOf(s1);
        System.out.println(s1);
        String s2="False";
        boolean b2=Boolean.valueOf(s2);
        System.out.println(b2);

        System.out.println("======================================");
        String r1="selcuk";
        Boolean T1=Boolean.valueOf(r1);// Boolean, true  none
        boolean b3=T1;  // unboxing
        // boolean =Boolean unboxing
//        Value of method of Boolean: any string other than "true"
//        will ALWAYS return false, not case sensitive

        System.out.println(T1);
        System.out.println(b3);










    }
}
