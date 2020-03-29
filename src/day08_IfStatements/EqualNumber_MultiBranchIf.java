package day08_IfStatements;
/*
        1.  write a program that can check the equality of the three given numberrs
        declare 3 numbers n1, n2, n3
        if n1 and n2 are equal  => n1&n2 are equal
        if n2 and n3 are equal ==> n2&n3 are equal
        if n3 and n1 are qual ==>n3&n1 are equal
        if all equal ==> all equal
        if none of them are euqal ==> none of them are equal
        */

public class EqualNumber_MultiBranchIf {
    public static void main(String[] args) {
        double n1 = 200.5;
        double n2 = 200.5;
        double n3 = 200.5;
        String result = " ";

        if (n1 == n2 && n1 != n3) {
            result = "n1 and n1 are equal";
        } else if (n1 == n3 && n1 != n2) {
            result = "n1 and n3 are equal";
        } else if (n2 == n3 && n1 != n3) {
            result = "n2 and n3 are equal";
        } else if (n2 == n3 && n2 == n1) {
            result = "All equal";
        } else {
            result = "None of them are equal";
        }
        System.out.println(result);

    }
}
