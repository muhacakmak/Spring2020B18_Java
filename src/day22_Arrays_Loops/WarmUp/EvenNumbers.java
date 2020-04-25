package day22.WarmUp;

public class EvenNumbers {
    /*
    Task01:
        1. create an int array called numbers that has length of 100
        2. assign 1~100 to the array' each indexes
        3. use for each loop to rpint out all the even numbers.
                MUst use continue statement


     */
    public static void main(String[] args) {


        int [] numbers=new int[101];
        for (int i = 1; i <=numbers.length -1; i++) {
            numbers[i]=i;
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        for (int eachNumbers:numbers) {
            if (eachNumbers % 2 != 0) {
                continue;
            }
            System.out.print(eachNumbers+" ");
        }


    }
}
