package day09_NestedIf_Ternary;

public class Ternary2 {
    public static void main(String[] args) {
        String result=" ";
        if(9>10){
            result="9 is greater";
        }else {
            result="10 is greater";
        }
        System.out.println("result1 "+ result);
        String result2=(9>10)?"9 is greater":"10 is greater";
        System.out.println("Result2 "+result2);
        System.out.println("==================================");
        int age =20;
        boolean eligibility=(age>=21)? true:false;
       /* if(age>=21){
            eligibility=true;
        }else {
            eligibility=false;
        }
        */
        System.out.println(eligibility);
        System.out.println("==================================");
        int ageOfPerson=20;
        String eligibleToVoe=" ";
        if(ageOfPerson>=18){
            eligibleToVoe="YES";
        }else {
            eligibleToVoe="NO";
        }
        System.out.println(eligibleToVoe);
        String eligibleToVoe2=(ageOfPerson>=18)? "YES":"NO";
        System.out.println(eligibleToVoe2);
    }
}
