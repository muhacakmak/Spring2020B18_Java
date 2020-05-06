package day34_CustomClass;

import day34_CustomClass.Carpet;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects {
    public static void main(String[] args) {
        Carpet[] carpets={new Carpet(),new Carpet(),new Carpet(),new Carpet(),new Carpet()};
        carpets[0].customOrder(7,8.5,20,true);
        carpets[1].customOrder(10,15,30,false);
        carpets[2].customOrder(9,20,15,true);
        carpets[3].customOrder(20,18,25,false);
        carpets[4].customOrder(35,45,35,false);


//        System.out.println(carpets[0]);
//        System.out.println(carpets[1]);
//        System.out.println(carpets[2]);
//        System.out.println(carpets[3]);
//        System.out.println(carpets[4]);

        ArrayList<Carpet>persianCarpet=new ArrayList <>();

        for (Carpet eachCarpet:carpets){
            if(eachCarpet.isPersian){
                persianCarpet.add(eachCarpet);
            }
        }
        System.out.println("There are "+persianCarpet.size()+" persian carpets");
        System.out.println(persianCarpet.get(0).calcCost());
        System.out.println(persianCarpet.get(1).calcCost());

        ArrayList<Carpet>regularCarpet=new ArrayList <>(Arrays.asList(carpets));


       // regularCarpet.removeAll(persianCarpet);

        regularCarpet.removeIf(p-> p.isPersian);
        System.out.println("There are "+regularCarpet.size()+" regular carpets");


        for (int i = 0; i <regularCarpet.size() ; i++) {
            System.out.println(regularCarpet.get(i).calcCost());

        }







    }
}
