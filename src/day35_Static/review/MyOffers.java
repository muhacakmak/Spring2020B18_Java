package day35_Static.review;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer offer1=new Offer();
        offer1.setOfferInfo("VA","BOA",100_000,true);
        Offer offer2=new Offer();
        offer2.setOfferInfo("KY","CapitalOne",120_000,false);
        Offer offer3=new Offer();
        offer3.setOfferInfo("MD","Chase",95_000,true);
        Offer offer4=new Offer();
        offer4.setOfferInfo("BayArea","Google",115_000,false);
        Offer offer5=new Offer();
        offer5.setOfferInfo("NY","CapitalOne",110_000,true);

        Offer[]offers={offer1,offer2,offer3,offer4,offer5};
        String myLocation="VA";

        ArrayList<Offer>accept=new ArrayList <>(Arrays.asList(offers));

        accept.removeIf(p->p.salary<100_000 || !p.isFullTime||!p.location.equals(myLocation));

       // 1- use for loop to print out the info of each offer
        System.out.println(accept.size());
        for (int i = 0; i <accept.size() ; i++) {
            System.out.println(i+1+". offer ==========================");
            System.out.println(accept.get(i));
        }
        // 2.1 the offer is full time position
//        System.out.println("2.1===============================================");
//        accept.removeIf(p->p.isFullTime==false);
//        for (int i = 0; i <accept.size() ; i++) {
//            System.out.println(i+1+". offer ==========================");
//            System.out.println(accept.get(i));
//        }


        // 2.2 offer is from your local area
//        System.out.println("2.2===============================================");
//        for (int i = 0; i <offerArrayList.size() ; i++) {
//            offerArrayList.removeIf(p->!p.location.equals("NJ"));
//            System.out.println(i+1+". offer ==========================");
//            System.out.println(offerArrayList.get(i));
//        }

        // 2.3 salary is greater than 100K
//        System.out.println("2.3===============================================");
//        for (int i = 0; i <accept.size() ; i++) {
//            accept.removeIf(p->p.salary<100);
//            System.out.println(i+1+". offer ==========================");
//            System.out.println(accept.get(i));
//        }

    }
}
