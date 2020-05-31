package day44_Exceptions;

public class try_catchBlock2 {
    public static void main(String[] args) {
        System.out.println("Hello");

        try {
            Thread.sleep(3000);

        }catch (Exception e){
            System.out.println("Catch block");

        }
        System.out.println("world");
    }

}
