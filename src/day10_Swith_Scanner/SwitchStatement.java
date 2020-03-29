package day10_Swith_Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        float a1=4.5f;
        long a2=10l;
        double a3=2.5d;
        boolean a4=true;
        // all abowe can not work with switc statmet


        int a=4;
        switch (a){
            case 1:
                System.out.println("One");
                break;
            default:
                System.out.println("Invalid case");
                break;
             case 2:
                System.out.println("Two");
                break;
             case 3:
                System.out.println("Three");
                break;
             case 4:
                System.out.println("Four");
                break;
        }
    }
}
