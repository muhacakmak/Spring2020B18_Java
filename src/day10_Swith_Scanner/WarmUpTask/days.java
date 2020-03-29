package day10_Swith_Scanner.WarmUpTask;
/*
2. write a program that can display the days based on the numbers 1 ~ 7
			MUST USE NESTED IF
 */

public class days {
    public static void main(String[] args) {
        int day = 2;
        String result = " ";




        switch (day) {
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:
                result = "Invalid entry";
        }
        System.out.println("Result: "+result);
        System.out.println("=============================");
        String result2=" ";

        if(day>0 && day<8){
            if(day==1){
                result2="Monday";
            }else if(day==2){
                result2="Tuesday";
            }
            else if(day==3){
                result2="Wednesday";
            }
            else if(day==4){
                result2="Tuesday";
            }
            else if(day==5){
                result2="Friday";
            }
            else if(day==6){
                result2="Saturday";
            }
            else {
                result2="Sunday";
            }


        }else {
            result2="Invalid Entry";
        }
        System.out.println("Result2: "+result2);
        System.out.println("=============================");
        String result3=" ";

        if(day>0 && day<8){
            result3= (day==1)?"Monday":(day==2)?"Tuesday" :(day==3)?"Wednesday": (day==4)?
                "Tuesday": (day==5)? "Friday": (day==6)? "Saturday": "Sunday";

        }else {
            result3="Invalid Entry";
        }
        System.out.println("Result3 : "+result3);


    }
}
