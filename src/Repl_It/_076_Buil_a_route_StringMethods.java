package Repl_It;

import java.util.Scanner;

public class _076_Buil_a_route_StringMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();
        String result = "";
        if (start.equalsIgnoreCase("A")) {
            if (end.equalsIgnoreCase("B")) {
                result = "right: " + end + " found";
            } else if (end.equalsIgnoreCase("C")) {
                result = "right > down: " + end + " found";

            } else if (end.equalsIgnoreCase("D")) {
                result = result = "right > down > left: " + end + " found";
            } else {
                result = end + " found";
            }
        } else if (start.equalsIgnoreCase("b")) {
            if (end.equalsIgnoreCase("C")) {
                result = "down: " + end + " found";
            } else if (end.equalsIgnoreCase("D")) {
                result = "down > left: " + end + " found";
            } else if (end.equalsIgnoreCase("A")) {
                result = "down > left > up: " + end + " found";
            } else {
                result = end + " found";
            }

        } else if (start.equalsIgnoreCase("C")) {
            if (end.equalsIgnoreCase("d")) {
                result = "left: " + end + " found";
            } else if (end.equalsIgnoreCase("A")) {
                result = "left > up: " + end + " found";
            } else if (end.equalsIgnoreCase("B")) {
                result = "left > up > right: " + end + " found";
            } else {
                result = end + " found";
            }
        } else if (start.equalsIgnoreCase("D")) {
            if (end.equalsIgnoreCase("A")) {
                result = "up: " + end + " found";
            } else if (end.equalsIgnoreCase("B")) {
                result = "up >right: " + end + " found";
            } else if (end.equalsIgnoreCase("C")) {
                result = "up > right > down: " + end + " found";
            } else {
                result = end + " found";
            }

        }
        System.out.println(result);

    }
}


