package Repl_It.Methods.returnMethods;

public class _157_MethodsWithReturn_2_max {
    /*
        max function gets two ints, x and y.
        x is the test case, y is what we test against.
        if  x is bigger then y return y
        in any other case return x.

        for example:

        max(1,10)
        returns 1

        max(11,5)
        returns 5
     */
    public static void main(String[] args) {


        System.out.println(max(11,5));

    }
    public static int max(int x,int  y){
        int result=0;
        if(x>y){
            result=y;
        }else {
            result=x;
        }

        return result;
    }

}
