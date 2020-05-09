package OfficeHours.Practice_05_06_2020.Assignment;

import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.ArrayList;

public class ScrumTeam {


    ArrayList<Testers>testersTeam=new ArrayList <>();
    ArrayList<Developers>developersTeam=new ArrayList <>();

    public void hireTester(Testers testers){
        testersTeam.add(testers);
    }
    public void fireTester(long id){
        testersTeam.removeIf(p->p.employeeID==id);
    }

    public void hireDevelopers(Developers developers){
        developersTeam.add(developers);
    }
    public void fireDeveloper(long id){
        developersTeam.removeIf(p->p.employeeID==id);
    }


}

