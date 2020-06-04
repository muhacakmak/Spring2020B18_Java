package day47_Abstraction;


abstract class A {
    public abstract void method1();

}

public class Abstract_VS_NonAbstract2 extends A {
    @Override
    public void method1() {

    }
}

abstract class B extends A {


}

class C extends B {
    public void method1() {

    }

}
