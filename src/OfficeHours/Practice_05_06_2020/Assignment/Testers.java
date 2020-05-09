package OfficeHours.Practice_05_06_2020.Assignment;

public class Testers {
    String name;
    long employeeID;
    String jobTitle;
    double salary;


    public void setTesterInfo(String name,String jobTitle,long employeeID,double salary){

        this.name=name;
        this.employeeID=employeeID;
        this.salary=salary;
        this.jobTitle=jobTitle;
    }
    public String toString(){
        return "Name: "+name+", jobTitle: "+jobTitle+", EmployeeID: "+employeeID+", Salary: $"+salary;
    }
    public void smokeTesting(){
        System.out.println(name+" is smoke testing");
    }
    public void creatingTicket(){
        System.out.println(name+" is creating ticket");
    }





}
