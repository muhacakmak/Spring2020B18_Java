package Resources;

import day42_Inheritance.AccessModifiers;
import day42_Inheritance.TestData2;


public class Inheritance2 extends AccessModifiers {
    //          sub                   super
    public static void main(String[] args) {


        System.out.println(TestData2.publicVariable);
        System.out.println(TestData2.protectedVariable);
       // System.out.println(TestData2.defaultVariable);
        //  System.out.println(TestData2.privateVariable);
        TestData2.publicMethod();
        TestData2.protectedMethods();
        //TestData2.defaultMethods();
        // TestData2.privateMethods();

    }
}
