package day17_WhileLoops;

public class BranchingStatement {
    public static void main(String[] args) {

        // System.exit(0); stops entire program immediately
/*
        for (int i = 0; i < 5; i++) {
            if(i%2!=0){
                System.exit(0);
            }
            System.out.println(i);
        }
*/

        if (10 > 9) {
            System.out.println("Hello");
            System.exit(0);
        }


        System.out.println("test completed");


    }
}
