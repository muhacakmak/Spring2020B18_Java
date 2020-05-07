package OfficeHours.Practice_05_06_2020;

public class InstanceVariables {
    int a = 100;// instance variable:

    public static void main(String[] args) {

      //  int a = 100; // local variable
        InstanceVariables obj1 = new InstanceVariables();
        obj1.a=300;
        System.out.println(300);


        InstanceVariables obj2 = new InstanceVariables();
        System.out.println(obj2.a);// 100


    }
}
