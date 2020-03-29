package OfficeHours.Practice_03_25_2020;

public class NestedIf_Practice2 {
    /*
        for the loan :
        if has a job that pays>500$===> might be eligible
        if has good credit
        if job history is more than or equal to 2 ==> then eligible

         */
    public static void main(String[] args) {
        int salary=4000;
        short creditScore=695;
        byte jobHistory=1;
        if(salary>5000){
            if(creditScore>650){
                if(jobHistory>=2){
                    System.out.println("You are qualified");

                }else {
                    System.out.println("You dont have enough job history, come back later");
                }

            }else {
                System.out.println("You do not have good credit score");
            }

        }else {
            System.out.println("You need have a job pays $5000");
        }








    }
}
