package day22_Arrays_Loops;

public class Count_Odd_Even {
    /*
    4. write a program that can count the even and odd number from an array of integers
                            MUST use for each loop
     */
    public static void main(String[] args) {


        int [] arr={1,2,3,4,5,6,7,8,9,10};


        int countOddNumber=0;
        int countEvenNumber=0;

        for (int eachNumber:arr){
            /*
            if(eachNumber%2!=0){
                countOddNumber++;
            }else {
                countEvenNumber++;
            }
            */

            if(eachNumber%2==0){
                countEvenNumber++;
                continue;
            }
            countOddNumber++;
        }




        System.out.println("Even number: "+countEvenNumber);
        System.out.println("Odd number: "+countOddNumber);




    }
}
