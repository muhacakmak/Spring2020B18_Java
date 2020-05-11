package day36_StaticBlocks.Tasks;

public class HumanResources {
    /*
    2. create a class called HumanResources
			declare 5 variables of Employee as static
			use static block to:
						1. initialize those static variables
						2. set all the info of the Employees
     */

    static Employee employee1=new Employee();
    static Employee employee2=new Employee();
    static Employee employee3=new Employee();
    static Employee employee4=new Employee();
    static Employee employee5=new Employee();
    static {
        employee1.setEmployeeInfo("Selcuk",'M',"85-362-362","Developer",2356,120_000);
        employee2.setEmployeeInfo("Elif",'M',"85-365-111","Manager",2356,120_000);
        employee3.setEmployeeInfo("Emir",'M',"86-389-389","SDET",2356,120_000);
        employee4.setEmployeeInfo("Namik",'M',"12-362-365","Developer",2356,120_000);
        employee5.setEmployeeInfo("Tahir",'M',"15-882-369","Developer",2356,120_000);
    }
}
