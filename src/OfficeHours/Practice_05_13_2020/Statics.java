package OfficeHours.Practice_05_13_2020;

public class Statics {
    int instanceVariable = 100;
    static int staticVariable = 200;

    public static void staticMethods() {
        //instanceMethods()
        //System.out.println(instanceVariable); static only expects static
        System.out.println(staticVariable);

    }

    public void instanceMethods() {
        staticMethods();
        System.out.println(staticVariable);
        System.out.println(instanceVariable);

    }

    public static void main(String[] args) {
        staticMethods();
        System.out.println(staticVariable);
       // System.out.println(instanceVariable); without obj i can't call

    }

}
