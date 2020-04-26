package Repl_It.Methods.returnMethods;

public class _162_Methods_WithReturn_7_3_locks_grop {
    public static void main(String[] args) {

        boolean per=threeLocks(true,true,false);
        if(per==true){
            System.out.println("I am in");
        }else {
            System.out.println("No");
        }


    }

    public static boolean threeLocks(boolean a, boolean b, boolean c) {

        return (a && b) || c == true;


    }
}
