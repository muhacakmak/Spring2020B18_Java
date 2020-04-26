package OfficeHours.Practice_04_22_2020;

public class Void_Method {

    public static void main(String[] args) {

        print();
        System.out.println("=====================");
        vote(21, true);
        System.out.println("========================");
        eligibleToBuyCig(21);

    }

    public static void print() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Batch 18");
        }
    }

    // write a function that can identify if a person id eligile to vote
    // must know age , USCitizen
    public static void vote(int age, boolean USCitizen) {
        boolean eligibleToVote = age >= 18 && USCitizen;
        if (eligibleToVote) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote yet");
        }
    }

    // write a program a method if a person is eligible to buy sigart
    public static void eligibleToBuyCig(int age) {
        if (age > 18) {
            System.out.println("Eligible to buy");
        } else {
            System.out.println("Not eligible to buy");
        }
    }


}
