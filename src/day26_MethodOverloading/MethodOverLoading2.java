package day26_MethodOverloading;

public class MethodOverLoading2 {
    /*
      first method: print sum of two number
      second method: print sum of three int  number
      third method: print sum of four int number

       */
    public static void main(String[] args) {
        // 10,5
        sum2Numbers(10, 5);
        // 10,5,5
        sum3Numbers(10, 5, 15);
        //10,20,30,5
        sum4Numbers(10, 20, 30, 5);
        System.out.println("================================================================");

        // 5 10
        sum(10,5);
        // 15 10 5
        sum(15,10,5);
        // 10,20,30,5
        sum(10,20,30,5);




    }

    public static void sum2Numbers(int a, int b) {
        System.out.println(a + b);
    }

    public static void sum3Numbers(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void sum4Numbers(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }

    //================================================================================================
    public static void sum(int a, int b) {
        System.out.println(a + b);

    }

    public static void sum(int a, int b, int c) {
        System.out.println(a + b + c);

    }

    public static void sum(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);

    }

}
