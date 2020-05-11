package day36_StaticBlocks.Tasks;

public class Employee {
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

