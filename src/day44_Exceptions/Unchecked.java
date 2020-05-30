package day44_Exceptions;

public class Unchecked {
    public static void main(String[] args) {
        System.out.println("Test started");
       // System.out.println(9/0);//Arithmetic Exception:

        String str="Cybertek";
//        System.out.println(str.charAt(-1));//IndexOutOfBoundsException
//        System.out.println(str.substring(10));//IndexOutOfBoundsException


        int[]arr={1,2,3};
        //System.out.println(arr[100]);//ArrayIndexOutOfBoundsException
        System.out.println(arr[200]);


        System.out.println("Test completed");




    }
}
