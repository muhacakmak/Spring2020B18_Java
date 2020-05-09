package day35_Static;

public class StaticVariables {
    int a2 = 200; // instance variable
    static int a3 = 300;

    public static void main(String[] args) {

        int a1 = 100;// local variable
        StaticVariables obj1 = new StaticVariables();
        obj1.a2 = 1000;
        obj1.a3=4000;
        obj1.a3=4000;




        StaticVariables obj2 = new StaticVariables();
        obj2.a2 = 2000;
        obj2.a3=5000;


        System.out.println(obj1.a2);
        System.out.println(obj2.a2);
        System.out.println(obj1.a3);

        System.out.println(obj2.a3);



    }
}
