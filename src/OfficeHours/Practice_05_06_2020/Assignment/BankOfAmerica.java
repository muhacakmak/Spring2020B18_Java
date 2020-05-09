package OfficeHours.Practice_05_06_2020.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class BankOfAmerica {
    public static void main(String[] args) {
        Developers developer1 = new Developers();
        developer1.setDeveloperInfo("Selcuk", "S.Developer", 1234, 100_000);
        Developers developer2 = new Developers();
        developer2.setDeveloperInfo("Emrah", "Usta developer", 56432, 120_000);
        Developers developer3 = new Developers();
        developer3.setDeveloperInfo("Tahir", "Baba developer", 32546, 130_000);
        Developers developer4 = new Developers();
        developer4.setDeveloperInfo("Elif", "Ana developer", 36987, 75_000);
        Developers developer5 = new Developers();
        developer5.setDeveloperInfo("Osman", "S.Developer", 31234, 120_000);
        Developers developer6 = new Developers();
        developer6.setDeveloperInfo("Veli", " developer", 256432, 80_000);
        Developers developer7 = new Developers();
        developer7.setDeveloperInfo("Hiyar", "Baba developer", 532546, 90_000);
        Developers developer8 = new Developers();
        developer8.setDeveloperInfo("Aaron", "Senior Developer", 120000, 112233);
        Developers developer9 = new Developers();
        developer9.setDeveloperInfo("Asia", "S.Developer", 61234, 100_000);
        Developers developer10 = new Developers();
        developer10.setDeveloperInfo("Muhtar", "Usta developer", 56432, 150_000);
        Developers developer11 = new Developers();
        developer11.setDeveloperInfo("Daniel", "Senior Developer", 932546, 130_000);
        Developers developer12 = new Developers();
        developer12.setDeveloperInfo("Barzy", " developer", 369587, 75_000);
        Developers developer13 = new Developers();
        developer13.setDeveloperInfo("Saide", "Sultan developer", 569857, 175_000);


        Testers tester1 = new Testers();
        tester1.setTesterInfo("Zeynep", "SDET", 8954, 80_000);
        Testers tester2 = new Testers();
        tester2.setTesterInfo("Ali", "usta SDET", 6987, 120_000);
        Testers tester3 = new Testers();
        tester3.setTesterInfo("Rahman", "SDET", 130_000, 22222);
        Testers tester4 = new Testers();
        tester4.setTesterInfo("Onur", "SDET", 9587, 80_000);

        ScrumTeam scrumTeam1 = new ScrumTeam();
        scrumTeam1.hireDevelopers(developer1);
        scrumTeam1.hireDevelopers(developer2);
        scrumTeam1.hireDevelopers(developer3);
        scrumTeam1.hireDevelopers(developer4);
        scrumTeam1.hireTester(tester1);
        scrumTeam1.hireTester(tester2);


        ScrumTeam scrumTeam2 = new ScrumTeam();
        scrumTeam2.hireDevelopers(developer5);
        scrumTeam2.hireDevelopers(developer6);
        scrumTeam2.hireDevelopers(developer7);
        scrumTeam2.hireDevelopers(developer8);
        scrumTeam2.hireTester(tester3);
        scrumTeam2.hireTester(tester4);


        ScrumTeam scrumTeam3 = new ScrumTeam();
        scrumTeam3.hireDevelopers(developer9);
        scrumTeam3.hireDevelopers(developer10);
        scrumTeam3.hireDevelopers(developer11);
        scrumTeam3.hireDevelopers(developer12);
        scrumTeam3.hireDevelopers(developer13);
        scrumTeam3.hireTester(tester1);
        scrumTeam3.hireTester(tester4);


        ScrumTeam[] arr = {scrumTeam1, scrumTeam2, scrumTeam3};


        for (int i = 0; i < arr.length; i++) {
//            if(scrum[i].testersTeam.get(i).salary>120_000){
//                System.out.println(scrum[i].testersTeam.get(i).name);
////            }
//            if(scrum[i].developersTeam.get(i).salary<120000){
//                System.out.println(scrum[i].developersTeam.get(i).name);
//            }

            System.out.println(arr[i].developersTeam.get(i).name + "\n");
        }


//
//
//        double salaryDevelopers=0;
//        for (int i = 0; i <scrumTeam1.developersTeam.size() ; i++) {
//            System.out.println(scrumTeam1.developersTeam.get(i));
//            salaryDevelopers+=scrumTeam1.developersTeam.get(i).salary;
//        }
//        System.out.println("Developers Salary: $"+salaryDevelopers);
//
//        double salaryTester=0;
//        for (int i = 0; i <scrumTeam1.testersTeam.size() ; i++) {
//            System.out.println(scrumTeam1.testersTeam.get(i));
//            salaryTester+=scrumTeam1.testersTeam.get(i).salary;
//        }
//        System.out.println("Testers Salary: $"+salaryTester);
//        System.out.println("Scrum team total budget: $"+(salaryDevelopers+salaryTester));
//


    }
}
