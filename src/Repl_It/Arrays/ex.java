package Repl_It.Arrays;

import java.util.Scanner;

public class ex {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String model = scan.next();
        int year = scan.nextInt();
        boolean recalled;
        if(model.equalsIgnoreCase("Extravagant")){
            if(year > 2009 && year < 2013) {
                recalled=true;
            }else{
                recalled=false;
            }
        }else if (model.equalsIgnoreCase("Guzzler")){
            if(year > 2014 && year < 2019) {
                recalled=true;
            }else{
                recalled=false;
            }
        } else{
            recalled=false;
        }
        System.out.println(recalled);
    }
}

