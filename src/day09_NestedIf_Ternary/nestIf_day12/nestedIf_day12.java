package day09_NestedIf_Ternary.nestIf_day12;

public class nestedIf_day12 {
    public static void main(String[] args) {
        int A=20, B=20, C=30;
        String result=" ";

        if(A==B && B==C){
            result="All are equal";
        }else {
            if(A==B){
                result="A and B are equal ";
            }else if(A==C){
                result="A and C are equal";
            }else if(B==C){
                result="B and C are equal";
            }else {
                result= "None of them are equal";
            }
        }
        System.out.println(result);
    }
}
