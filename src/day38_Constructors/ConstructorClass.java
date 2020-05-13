package day38_Constructors;

public class ConstructorClass {
    public ConstructorClass(){
        method1();
        method2();
    }

    public ConstructorClass(int a){
        //  ConstructorCalls();
        this();

    }

    public static void method1(){
        // method2();
        //  ConstructorCalls();
    }

    public  void method2(){
        method1();
    }
}
