import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Split:");
        String split = input.next();
        System.out.print("Number of People:");
        int numberOfPeople = input.nextInt();
        System.out.print("Check amount:");
        double checkAmount = input.nextDouble();
        System.out.print("Service Quality:");
        String serviceQuality = input.next();
        double totalTip = 0;


        if (serviceQuality.equalsIgnoreCase("Poor")) {
            totalTip = checkAmount * 0.05;
        } else if (serviceQuality.equalsIgnoreCase("Fair")) {
            totalTip = checkAmount * 0.10;
        } else if (serviceQuality.equalsIgnoreCase("Good")) {
            totalTip = checkAmount * 0.15;
        } else if (serviceQuality.equalsIgnoreCase("Great")) {
            totalTip = checkAmount * 0.20;
        } else if (serviceQuality.equalsIgnoreCase("Excellent")) {
            totalTip = checkAmount * 0.25;
        }

        double totalToPay = checkAmount + totalTip;
        double totalPerPerson = totalToPay / numberOfPeople;
        double tipPerPerson = totalTip / numberOfPeople;
        String numberOfPeopleEnter = "";
        switch (numberOfPeople) {
            case 1:
                numberOfPeopleEnter = "&";
                break;
            case 2:
                numberOfPeopleEnter = "&&";
                break;
            case 3:
                numberOfPeopleEnter = "&&&";
                break;
            case 4:
                numberOfPeopleEnter = "&&&&";
                break;
            case 5:
                numberOfPeopleEnter = "&&&&&";
                break;
        }
        if (split.equalsIgnoreCase("yes")) {
            System.out.println("Number of people entered: " + numberOfPeopleEnter);
            System.out.println("Total to pay: " + totalToPay);
            System.out.println("Total tip: " + totalTip);
            System.out.println("Total per person: " + totalPerPerson);
            System.out.println("Tip per person: " + tipPerPerson);

        }else{
            System.out.println("Number of people entered: " + numberOfPeopleEnter);
            System.out.println("Total to pay: " + totalToPay);
            System.out.println("Total tip: " + totalTip);

        }

    }
}
