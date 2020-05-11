package day36_StaticBlocks.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class BOFAzerbaijan {
    public static void main(String[] args) {
        HR humanResources=new HR();
        ArrayList <Employee> employeeList=new ArrayList <>();
        employeeList.addAll(Arrays.asList(HR.employee1,HR.employee2));

        System.out.println(employeeList.size());
        for (Employee each:employeeList) {
            System.out.println(each);
        }

    }
}
class Employees {
    /*
   1. Create a class called Employee
           instance variables:
   name, id, ssn, jobTitle, salary, gender
   actions:
   setEmployeeInfo(): can initialize all the instance variables
   toString(): can return the info of the employee as string
    */
    String name;
    long id;
    String snn;
    String jobTitle;
    double salary;
    char gender;
    public void setEmployeeInfo(String name, char gender, String snn, String jobTitle, long id, double salary) {
        this.name = name;
        this.gender = gender;
        this.snn = snn;
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
    }
    public String toString() {
        return "Name: " + name + ", Gender: " + gender
                + ", SNN: " + snn + ", job Title: " + jobTitle
                + ", id: " + id + ", Salary: $" + salary;
    }
}

class HR {
     /*
    2. create a class called HumanResources
			declare 5 variables of Employee as static
			use static block to:
						1. initialize those static variables
						2. set all the info of the Employees
     */

    static Employee employee1 = new Employee();
    static Employee employee2 = new Employee();
    static Employee employee3 = new Employee();
    static Employee employee4 = new Employee();
    static Employee employee5 = new Employee();
    static {
        employee1.setEmployeeInfo("Selcuk",'M',"85-362-362","Developer",2356,120_000);
        employee2.setEmployeeInfo("Elif",'M',"85-365-111","Manager",2356,120_000);
        employee3.setEmployeeInfo("Emir",'M',"86-389-389","SDET",2356,120_000);
        employee4.setEmployeeInfo("Namik",'M',"12-362-365","Developer",2356,120_000);
        employee5.setEmployeeInfo("Tahir",'M',"15-882-369","Developer",2356,120_000);
    }

}
