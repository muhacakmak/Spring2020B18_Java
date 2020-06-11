package day48_Abstraction;

interface I1 {
   public void method1();
}

interface I2 extends I1 {
    void method2();

}

abstract class AC implements I2{
    abstract void method3();

}

public abstract class Extends_implements extends AC {

    @Override
    public void method3() {

    }


}
class testRun extends Extends_implements{
    public void method1(){

    }


    @Override
    public void method2() {

    }
}