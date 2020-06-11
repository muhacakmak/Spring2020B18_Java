package day47_Abstraction.Task01;

public class Developer extends Employee {
    public Developer(String name, int age, char gender, double salary, String jobTitle){
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
