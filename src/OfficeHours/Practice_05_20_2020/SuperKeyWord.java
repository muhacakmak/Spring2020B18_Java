package OfficeHours.Practice_05_20_2020;

class Data{
    int a=100;

    public void method(){
        System.out.println("Hello World");
    }
}



public class SuperKeyWord extends Data{
    int a=200;

    public void method(){
        System.out.println("Hello Cybertek");
    }
    public SuperKeyWord(){
        super.method();
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        SuperKeyWord obj=new SuperKeyWord();



    }

}
