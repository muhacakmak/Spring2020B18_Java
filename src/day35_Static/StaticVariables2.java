package day35_Static;

public class StaticVariables2 {
    int insVariable;// every single object
    static int staticVariables;

    public static void main(String[] args) {
        StaticVariables2 obj1=new StaticVariables2();
        obj1.insVariable=300;
        obj1.staticVariables=400;


        StaticVariables2 obj2=new StaticVariables2();


        System.out.println(obj1.insVariable);//300
        System.out.println(obj2);//0

        System.out.println();
        System.out.println(obj1.staticVariables);
        System.out.println(obj2.staticVariables);

        System.out.println();
        System.out.println(StaticVariables2.staticVariables);









    }



}
