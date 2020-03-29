package day12_JavaRecap;

public class QuizReveiw {
    public static void main(String[] args) {
        boolean result=true;
        int N=100;
        if(result){
            N/=10;
            result=!result;
        }
        if(result){
            N*=2;
        }else {
            N-=5;
        }
        System.out.println(N);
    }
}
