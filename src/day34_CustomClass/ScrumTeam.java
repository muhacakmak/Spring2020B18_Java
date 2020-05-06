package day34_CustomClass;

import java.util.ArrayList;

public class ScrumTeam {
    String name;

    ArrayList <Testers> listOfTesters = new ArrayList <>();

    ArrayList <Developers> listOfDevelopers = new ArrayList <>();


    public void hireTester(Testers testers) {
        listOfTesters.add(testers);
    }

    public void fireTester(Testers testers) {
        listOfTesters.remove(testers);
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
