package day34_CustomClass;

import java.util.ArrayList;

public class ScrumTeam {
    String name;

    ArrayList <Testers> testerTeam = new ArrayList <>();

    ArrayList <Developers> listOfDevelopers = new ArrayList <>();


    public void hireTester(Testers testers) {
        testerTeam.add(testers);
    }

    public void fireTester(long employeeID) {
        testerTeam.removeIf(p->p.employeeID==employeeID);
    }

    public void hireDeveloper(Developers developers) {
        listOfDevelopers.add(developers);
    }

    public void fireDeveloper(Developers developers) {
        listOfDevelopers.remove(developers);
    }
    public void DailyStandUp(Developers developers,Testers testers,String name) {

        this.name=name;

    }

}
