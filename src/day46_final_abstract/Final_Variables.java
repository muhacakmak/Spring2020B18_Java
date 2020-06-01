package day46_final_abstract;

public class Final_Variables {
    final int InstanceVariable = 300;
  // final int InstanceVariable2; // you need to be initialized
   final static int staticVariable=1000;

    //final static int staticVariable2;you need to be initialized immediatly


    public static void main(String[] args) {


        final double PI = 3.14;
        //PI=3.15;
        final String gender = "Male";
        // gender="Female";

        final int score;
        score = 100;
        //score=200;

        System.out.println(score);
        System.out.println("==============================================");
        Final_Variables obj = new Final_Variables();
        //obj.InstanceVariable=400; cant reassign because it final
       // staticVariable=2000; //if it is final you can not reassign




    }
}
