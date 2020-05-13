package day38_Constructors;

public class Test {


    public Test() {
        System.out.println("Constructor");
    }

    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Instance block");
    }
    public static void main(String[] args) {

        new Test();// instance, constructor
        System.out.println("Main methods");
       // new Test();// instance, constructor


    }
}
