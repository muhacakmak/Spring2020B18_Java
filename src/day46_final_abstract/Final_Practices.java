package day46_final_abstract;

public class Final_Practices {
    final int a = 10;
    final static int b = 20;

    {
        System.out.println(a);
        //a=30 final can not be reassigned
    }

    static {
        System.out.println(b);
        //b=30; final can not be reassigned
    }

    public Final_Practices() {

    }

    void method1() {

    }

    public final static void method2() {

    }

    private final  int method1(int a) {
        return 12;
    }


}

class test extends Final_Practices {
    /*
    @Override
    public void method1() {
    }
     */

}


