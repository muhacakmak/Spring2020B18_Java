package OfficeHours.Practice_05_06_2020;

import java.util.ArrayList;

/*
Attributes:
				name
				List of Testers,
				List of Developers,
			Actions:
				hireTester
				fireTester
				hireDeveloper
				fireDeveloper
				DailyStandUp
 */
public class ScrumTeam {
    ArrayList<Tester>testersTeam=new ArrayList <>();
    ArrayList<Developer>developersTeam=new ArrayList <>();

    public void hireATester(Tester tester){
        testersTeam.add(tester);
    }
    public void fireATester(long id) {
        testersTeam.removeIf(eachTester->eachTester.employeeId==id);
    }
    public void hireADeveloper(Developer developer){
        developersTeam.add(developer);
    }
    public void fireADeveloper(long id) {
        developersTeam.removeIf(eachDeveloper->eachDeveloper.employeeId==id);
    }
}


