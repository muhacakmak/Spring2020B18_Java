package OfficeHours.Practice_05_06_2020;

public class AppleINC {
    public static void main(String[] args) {
        Tester tester1=new Tester();
        tester1.setInfo("Onur","Junior Tester",75000,1234);

        Tester tester2=new Tester();
        tester2.setInfo("John","Junior",75000,1245);

        Tester tester3=new Tester();
        tester3.setInfo("Rahman","SDET",120000,22222);


        ScrumTeam scrum1=new ScrumTeam();
        scrum1.hireATester(tester3);
        scrum1.hireATester(tester1);
        scrum1.hireATester(tester2);
        //scrum1.fireATester(1245);
        for (Tester each:scrum1.testersTeam) {
            System.out.println(each);

        }
        System.out.println("=====================================================");
        Developer developer1=new Developer();
        developer1.setInfo("Barzy","Senior Developer",220200,1122337);
        Developer developer2=new Developer();
        developer2.setInfo("Emrah","Usta Developer",100000,223232);
        scrum1.hireADeveloper(developer1);
        scrum1.hireADeveloper(developer2);
        //scrum1.fireADeveloper(1122337);

        for (Developer each:scrum1.developersTeam) {
            System.out.println(each);
        }
        System.out.println(scrum1.developersTeam.size());
        System.out.println("==================================================");


        System.out.println("In my scrum team, We have "+scrum1.testersTeam.size()
                +" testers and "+scrum1.developersTeam.size()+" developers.");

    }
}
