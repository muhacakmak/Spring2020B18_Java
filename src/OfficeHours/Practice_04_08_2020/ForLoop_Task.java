package OfficeHours.Practice_04_08_2020;

public class ForLoop_Task {
    public static void main(String[] args) {
        /*
        print all numbers between 0~100 that can be divisible by 3 or 5

         */
//        for (int i = 15; i <=100 ; i+=15) {
//            System.out.println(i+" ");
//        }

        for (int i = 0; i <=100 ; i++) {
            if(i%3==0||i%5==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        System.out.println("============================");
        String name="Selcuk";
        String reverse=" ";
        for (int i = name.length()-1; i >=0 ; i--) {
            reverse+=name.charAt(i);


        }
        System.out.println(reverse);
        if(!name.isEmpty()) {
            if (name.equalsIgnoreCase(reverse)) {
                System.out.println(name + "is palindrome name");
            } else {
                System.out.println(name + " is not palindrome name");
            }
        }else {
            System.out.println("The name is empth");
        }
        System.out.println("=========substring===========");
        name="Selcuk";
         String reverse1=" ";
        for (int i = name.length()-1; i >=0 ; i--) {
            reverse1+=name.substring(i,i+1);
        }
        System.out.println(reverse1);


   }
}
