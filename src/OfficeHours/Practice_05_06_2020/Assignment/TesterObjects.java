package OfficeHours.Practice_05_06_2020.Assignment;

public class TesterObjects {
    public static void main(String[] args) {
        Testers testers1=new Testers();
        testers1.setTesterInfo("Emarh","SDET",1234,100_000);
//        System.out.println(testers1.name);
//        System.out.println(testers1.JobTitle);
        System.out.println(testers1);
        testers1.smokeTesting();
        testers1.creatingTicket();



//        testers1.name="Emrah";
//        testers1.employeeID=1234;
//        testers1.JobTitle="SDET";
//        testers1.salary=100_000;
    }
}
