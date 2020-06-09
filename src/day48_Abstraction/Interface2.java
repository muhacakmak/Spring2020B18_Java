package day48_Abstraction;

public interface Interface2 {
    //public Interface2(){} you can not have constructor  method

//    public void method1(){ you can not have instance method
//    }
//{
//    you can have instance blocs
//}
//    static {
//          you can not have static bloc
//}
int a=100;
    public static void main(String[] args) {
        System.out.println(a);// by default static
      // a=200; con not reassign  because it is final
    }
    static void method4(){
    }
     void method5();
    public default void method6(){

    }



}
