package day48_Abstraction;

interface P {
    void method1();

}

interface Q {
     int method2();
}

abstract class R {
    abstract void method3();
}

public class Extends_implements2 extends R implements P ,Q{


    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    void method3() {

    }
}
