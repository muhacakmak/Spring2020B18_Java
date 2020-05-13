package day38_Constructors;

public class ConstructorClass2 {
    public ConstructorClass2(){
        System.out.println("Default constructor");

    }
     public ConstructorClass2(int a){
         this();
         System.out.println("Constructor with int argument");


     }
     public ConstructorClass2(String str){
        this(10);
         System.out.println("Constructor with String argument");

    }

    public static void main(String[] args) {
        ConstructorClass2 obj=new ConstructorClass2("Hello");





    }

    public void method1(){
        //ConstructorClass2();
    }


    {

    }





}
