package day42_Inheritance;

class Test {
    public Test(int a) {
        this(10.5);
        System.out.println("A");
    }
    public Test(double a) {
        System.out.println("C");
    }


}

public class Constructor2 extends Test {
    public Constructor2() {
       super(10);

        System.out.println("B"); //B
    }


    public static void main(String[] args) {

        Test obj = new Test(10);
       // Constructor2 obj=new Constructor2();

    }
}
