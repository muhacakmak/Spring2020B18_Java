package day34_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {
        Testers tester1=new Testers();
        tester1.setTestersInfo("Muhtar",123,"Manual Tester",78000);

        ScrumTeam scrum=new ScrumTeam();
        scrum.hireTester(tester1);

        System.out.println(scrum.testerTeam.size());




    }
}
