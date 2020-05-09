package OfficeHours.Practice_05_06_2020.Assignment;

public class Developers {
    String name;
    long employeeID;
    String jobTitle;
    double salary;


    public void setDeveloperInfo(String name,String jobTitle,long employeeID,double salary){

        this.name=name;
        this.employeeID=employeeID;
        this.salary=salary;
        this.jobTitle=jobTitle;
    }
    public String toString(){
        return "Name: "+name+", jobTitle: "+jobTitle+", EmployeeID: "+employeeID+", Salary: $"+salary;
    }
    public void coding(){
        System.out.println(name+" is coding");
    }
    public void fixingBugs(){
        System.out.println(name+" is fixing bug");
    }

    ScrumTeam scrumTeam1=new ScrumTeam();







}
