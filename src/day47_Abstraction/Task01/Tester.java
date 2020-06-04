package day47_Abstraction.Task01;

public class Tester extends Employee {
    public Tester(String name,int age, char gender,double salary,String jobTitle){
       this.name=name;
       this.age=age;
       this.gender=gender;
       this.salary=salary;
       this.jobTitle=jobTitle;
    }


    @Override
    public void work() {

    }

    @Override
    public String toString() {
        return null;
    }
}
