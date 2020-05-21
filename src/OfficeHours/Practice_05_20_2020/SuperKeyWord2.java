package OfficeHours.Practice_05_20_2020;
class TestData{
    int num=100;
    String name="Cybertek";
    public void method(){
        System.out.println("Cybertek School");
    }
}
public class SuperKeyWord2 extends TestData{
    int num=200;
    String name="MIT";
    public void method(){
        System.out.println("MIT School");

    }
    public SuperKeyWord2(){
        super.method();
        System.out.println(num);
        System.out.println(super.name);
    }

    public static void main(String[] args) {
        SuperKeyWord2 obj =new SuperKeyWord2();


    }
}
