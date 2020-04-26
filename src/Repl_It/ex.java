package Repl_It;

import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double papatyaCost = 5;
        double karanfil = 7;
        double gulCost = 10;
        double orkideCost = 15;

        double fiyat = 0;
        System.out.println("1. Papatya");
        System.out.println("2. Karanfil");
        System.out.println("3. Gul");
        System.out.println("4. Orkide");
        System.out.println("Cicek turu giriniz: ");
        int cicekTur = scan.nextInt();


        int sayac = 1;
        while (cicekTur > 4 || cicekTur <= 0) {
            System.out.println(3 - sayac + " hakkin kaldi");
            System.out.println("Hatali secim");
            System.out.println("Cicek turu tekrar giriniz: ");
            cicekTur = scan.nextInt();

            sayac++;
            if (sayac == 3) {
                break;
            }

        }
        System.out.println(sayac + ". kes girdiniz hakkinizi kayip ettiniz akilli ol");
        System.exit(0);
        System.out.println("Adet giriniz: ");
        double adet = scan.nextInt();
        if (cicekTur == 1) {

            if (adet <= 49) {
                fiyat = adet * papatyaCost;
            } else if (adet >= 50 && adet <= 100) {
                fiyat = (papatyaCost * adet) * 0.90;
            } else if (adet > 100 && adet <= 200) {
                fiyat = papatyaCost * adet * 0.75;
            } else {
                fiyat = papatyaCost * adet * 0.70;
            }
        } else if (cicekTur == 2) {
            if (adet <= 39) {
                fiyat = adet * karanfil;
            } else if (adet >= 40 && adet <= 80) {
                fiyat = karanfil * adet * 0.95;
            } else if (adet >= 80 && adet <= 150) {
                fiyat = karanfil * adet * 0.90;
            } else {
                fiyat = karanfil * adet * 0.80;
            }
        } else if (cicekTur == 3) {
            if (adet < 30) {
                fiyat = gulCost * adet;
            } else if (adet >= 30 && adet <= 60) {
                fiyat = gulCost * adet * 0.95;
            } else if (adet >= 60 && adet <= 100) {
                fiyat = gulCost * adet * 0.90;
            } else {
                fiyat = gulCost * adet * 0.85;
            }
        } else if (cicekTur == 4) {
            if (adet < 20) {
                fiyat = adet * orkideCost;
            } else if (adet >= 20 && adet <= 50) {
                fiyat = orkideCost * adet * 0.95;
            } else {
                fiyat = orkideCost * adet * 0.90;
            }
        }

        System.out.println(fiyat * 1.18);
    }
}



