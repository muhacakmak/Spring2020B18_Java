package day08_IfStatements;

public class MultiBranchIf_Practice {
    public static void main(String[] args) {
        double score = 70.5;

        char grade = ' ';
        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score < 90) {
            grade = 'B';
        } else if (score >= 70 && score < 80) {
            grade = 'C';
        } else if (score >= 60 && score < 70) {
            grade = 'D';
        }else {
            grade='F';
        }
        System.out.println("Your score is: "+score+"\nyour grade is: "+grade);
    }
}
