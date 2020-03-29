package day08_IfStatements;

public class MultiBranchIf {
    public static void main(String[] args) {

        int a=100;

        if(a==0){
            System.out.println("Zero");
        } else if(a>0){
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
}
