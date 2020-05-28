package OfficeHours.Practice_05_27_2020;

public class methodOverriding {
    void method1() {
        System.out.println("Super class");
    }


}

class Test extends methodOverriding {
    // sub             super
    @Override
    protected void method1() {
        System.out.println("Sub class");
    }


    public static void main(String[] args) {
//        methodOverriding obj=new methodOverriding();
//        obj.method1();
        Test obj = new Test();
        obj.method1();


    }


}
