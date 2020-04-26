package OfficeHours.Practice_04_15_2020;

public class ForEachLoop {
    public static void main(String[] args) {
        /*
        for each loop
        for(DateType variableName:ArrName)
         */

        int [] arr={1,2,3,4};

//
//        for (int i = 0; i <arr.length ; i++) {
//            int number=arr[i];
//            System.out.print(number+" ");
//        }
//        System.out.println("\n============");

        for (int eachElement:arr){

            if(eachElement==3){
                continue;
            }

            System.out.print(eachElement+" ");


        }
        System.out.println();

        int []arr2={1,2,3,4,5,6,7,8,10};


        for (int eachElement:arr2){
            if(eachElement%2!=0) {
                continue;
            }
                System.out.print(eachElement+" ");

        }



    }
}
