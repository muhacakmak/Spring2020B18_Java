package day24_Methods;

public class ReturnMethods {
    public static void main(String[] args) {
       // maxMin(10, 20);
        int result = addition(1000, 2000);

        System.out.println(result*20);

        int result2 = result + 2000;
        System.out.println(result2);
    }

    public static void maxMin(int a, int b) {
        if (a >= b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    public static int addition(int a, int b) {


        return a + b;
    }

}
