package day38_Constructors;

public class ConstructorClass3 {
    public ConstructorClass3() {
        this(9);
        System.out.println("default");
    }

    public ConstructorClass3(int a) {
       // this();//constructor can not contain itself becous line 6
        System.out.println("Int argument");
    }
    public ConstructorClass3(String str) {
        //this("Hello"); can't call

    }


    public static void main(String[] args) {
        ConstructorClass3 obj=new ConstructorClass3();
    }

    public void method1() {
        //this();

    }

}
