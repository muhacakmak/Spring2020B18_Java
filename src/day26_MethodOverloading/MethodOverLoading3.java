package day26_MethodOverloading;

public class MethodOverLoading3 {
    /*
    first method: can find the sum of two int numbers
    second method: can find the sum of two double numbers
 */
    public static void main(String[] args) {
        sum(10,20);
        sum(1.5,2.5);
        System.out.println(sum(1.5,2.5));
        //25L, 30L
       double num2= sum(25L,30L);
        sum((int) 25L,(int) 30L);

    }

    public static void sum (int a, int b){
        System.out.println(a+b);
    }
    public static double sum (double a, double b){
       return a+b;
    }

}
