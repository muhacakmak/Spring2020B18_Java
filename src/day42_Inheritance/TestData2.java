package day42_Inheritance;

public class TestData2 extends AccessModifiers {
    public static void main(String[] args) {
        System.out.println(TestData2.publicVariable);
        System.out.println(TestData2.protectedVariable);
        System.out.println(TestData2.defaultVariable);
      //  System.out.println(TestData2.privateVariable);
        TestData2.publicMethod();
        TestData2.protectedMethods();
        TestData2.defaultMethods();
       // TestData2.privateMethods();



    }

}
