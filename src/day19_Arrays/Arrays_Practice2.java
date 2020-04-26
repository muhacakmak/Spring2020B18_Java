package day19_Arrays;

import java.util.Scanner;

public class Arrays_Practice2 {
    public static void main(String[] args) {
        int[] arr={10,20,30};

        System.out.println(arr.length);

        int[] arr2=new int[5];

        String[] Testers=new String[3];


        Testers[0]="Reem";
        Testers[1]="Madina";
        Testers[2]="Osman";
        System.out.println(Testers[0]);
        System.out.println(Testers[1]);
        System.out.println(Testers[2]);
        System.out.println(Testers.length);

        System.out.println("=============================================");
        Scanner input=new Scanner(System.in);
        String[] students=new String[10];
        System.out.println("Enter 10 student");
        for (int i = 0; i <=students.length-1; i++) {
            students[i]=input.nextLine();
        }
        for (int i = 0; i <=students.length-1 ; i++) {
            String name=students[i];
            System.out.println(name);
        }






    }
}
