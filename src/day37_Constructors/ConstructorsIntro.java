package day37_Constructors;

public class ConstructorsIntro {

    public ConstructorsIntro(int a ){
        System.out.println("Constructor with parameter of int");

    }
    public static void main(String[] args) {

       // ConstructorsIntro obj=new ConstructorsIntro();// object must be created by existing constructors

        ConstructorsIntro obj2=new ConstructorsIntro(10);
        ConstructorsIntro obj3=new ConstructorsIntro(20);



    }
}
