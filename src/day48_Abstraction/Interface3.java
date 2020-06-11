package day48_Abstraction;

public interface Interface3 {


    public void method1();

    public abstract void method2();

    static final int num=100;
    int num2=200;

    public static void main(String[] args) {
        Interface3.method3();
        System.out.println(Interface3.num2);


    }
    static void method3(){
        System.out.println("selcuk");
    }

}
