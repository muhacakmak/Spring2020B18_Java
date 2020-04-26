package CodinBat;

import java.util.Scanner;

public class yunus {
    public static void fakirler() {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        double tipToplami = 0;

        System.out.println("how many people?");
        int amountPeople = scan.nextInt();
        if (amountPeople <= 0) {
            System.err.println("amount of people cannot be 0 or less");
        } else {

            System.out.println("total to pay:");
            double totalAmount = scan.nextDouble();
            if (totalAmount <= 0) {
                System.err.println(" Total amount cannot be 0 or less");
            } else {
                System.out.println("total per person: " + totalAmount / amountPeople);

                while (i <= amountPeople) {
                    System.out.println("enter the tip amount for customer " + i + ": ");
                    double tip = scan.nextDouble();
                    if (tip < 0) {
                        System.err.println("amount of tip cannot be 0 or less");
                    } else {
                        tipToplami = tip + tipToplami;
                        i++;
                    }
                }
                int tipToplami2 = (int) tipToplami;

                System.out.println("toplam verilen tip" + tipToplami);

                if (tipToplami > 24.99) {
                    System.out.println(tipToplami2 + "% Service Excellent!");
                } else if (tipToplami > 19.99) {
                    System.out.println(tipToplami2 + "% Great Excellent!");
                } else if (tipToplami > 14.99) {
                    System.out.println(tipToplami2 + "% Good Excellent!");
                } else if (tipToplami > 9.99) {
                    System.out.println(tipToplami2 + "% Fair Excellent!");
                } else if (tipToplami > 4.99) {
                    System.out.println(tipToplami2 + "% Poor Excellent!");
                } else {
                    System.out.println("tip verilmemis, cimri turkler olmali !");
                }
            }
        }
    }

    public static void bonkorSelcukBeyinMasasi() {
        double tipToplami = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("how many people?");
        int amountPeople = scan.nextInt();
        if (amountPeople <= 0) {
            System.err.println("amount of people cannot be 0 or less");
        } else {

            System.out.println("total to pay:");
            double totalAmount = scan.nextDouble();
            if (totalAmount <= 0) {
                System.err.println(" Total amount cannot be 0 or less");
            } else {

                System.out.println("enter the tip amount:");
                double tip = scan.nextDouble();
                if (tip < 0) {
                    System.err.println("amount of tip cannot be 0 or less");
                } else {
                    tipToplami = (tip / totalAmount) * 100;
                    int tipToplami2 = (int) tipToplami;

                    if (tipToplami > 24.99) {
                        System.out.println(tipToplami2 + "% Service Excellent!");
                    } else if (tipToplami > 19.99) {
                        System.out.println(tipToplami2 + "% Great Excellent!");
                    } else if (tipToplami > 14.99) {
                        System.out.println(tipToplami2 + "% Good Excellent!");
                    } else if (tipToplami > 9.99) {
                        System.out.println(tipToplami2 + "% Fair Excellent!");
                    } else if (tipToplami > 4.99) {
                        System.out.println(tipToplami2 + "% Poor Excellent!");
                    } else {
                        System.out.println("tip verilmemis, cimri turkler olmali !");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("is that split?");
        String splitOrnot = scan.nextLine();

        if (splitOrnot.equals("yes")) {
            fakirler();
        } else if (splitOrnot.equals("no")) {
            bonkorSelcukBeyinMasasi();
        } else {
            System.err.println("undefined!");
        }

    }

}


