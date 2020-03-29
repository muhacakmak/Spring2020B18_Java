package day09_NestedIf_Ternary.SwitchStatement;

public class SwitchStatement_day12 {
    public static void main(String[] args) {
        int score=1;
        if(score==1){
            System.out.println("1");
        }else if(score==2){
            System.out.println("2");
        }
        switch (score){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("Invalid");
        }
        char grade='A';
        switch (grade){

            case 'B':
                System.out.println("Passed with B");
            case 'C':
                System.out.println("Passed with A");
            default:
                System.out.println("failed");
        }

    }
}
