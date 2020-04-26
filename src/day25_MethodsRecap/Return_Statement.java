package day25_MethodsRecap;

public class Return_Statement {
    public static void main(String[] args) {
        methods1();
        //System.out.println("hello");
        methods2();
        System.out.println("hello");

    }

    public static void methods1(){

        if(10>9){
            return;
        }
        System.out.println("Hello Cybertek");
    }

    public static void methods2() {

        if (10 > 9) {
            System.exit(0);
        }
        System.out.println("Hello Cybertek");
    }


}
