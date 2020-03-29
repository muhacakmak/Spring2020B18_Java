package day08_IfStatements.Task_day11;

public class LeapYear {
    public static void main(String[] args) {
        int year=2000;
        boolean leapYear=year%4==0;
        String result=" ";
        if(leapYear){
            result="Year is "+year+" is leap year";

        }else {
            result="Year is "+year+" is not  leap year";
        }
        System.out.println(result);
    }
}
