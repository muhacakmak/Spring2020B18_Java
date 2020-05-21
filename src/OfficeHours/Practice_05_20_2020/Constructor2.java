package OfficeHours.Practice_05_20_2020;



class test{
    public test(String str){
        System.out.println("String");

    }
    public test(int a){

    }
    public test(double a){

    }

}
public class Constructor2 extends test {
    public Constructor2(){
        super("Hello");
        System.out.println("Default");
    }
    public void method(){

    }
    public static void main(String[] args) {
        Constructor2 obj=new Constructor2();
    }

}
