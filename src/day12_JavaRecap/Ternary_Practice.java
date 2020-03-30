package day12_JavaRecap;

import java.util.Scanner;

public class Ternary_Practice {
    /*
     200, OK
     201, Created
     202, Accepted
      */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter statues code: ");
        int statusCode=scan.nextInt();
        String result="";
        if(statusCode==200){
            result="Ok";
        }else if(statusCode==201){
            result="Created";
        }else if(statusCode==202){
            result="Accepted";
        }else {
            result="Invalid status code";
        }
        System.out.println(result);
        System.out.println("Enter statues code: ");
        int statusCode2=scan.nextInt();


        String result2=(statusCode2==200)?"Ok":(statusCode2==201)?"Created":
                (statusCode2==202)?"Accepted":"Invalid status code";
        System.out.println(result2);
    }
}
