package day15_ForLoop;

public class ForLoop_Practice {
    /*
     odd number between 1-100 in single line sperate by space
     */
    public static void main(String[] args) {
        String resultOdd="";


        for (int number = 1; number <=100; number+=2) {
            resultOdd+=number +" ";

        }
        System.out.println("Odd number: "+resultOdd);

        /*
        even number between 0-100
        2 4
         */

        String resultEven="";

        for (int number = 0; number <=100 ; number+=2) {
            resultEven+=number+" ";

        }
        System.out.println("Even number: "+ resultEven);




    }
}
