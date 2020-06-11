package day47_Abstraction.Task01;
/*
1. create an abstract class called Employee
				attributes: name, age, gender, salary, jobtitle
				methods:
						abstract methods: work()
						instance method: toString()
 */
public abstract class Employee {
    public String name;
    public int age;
    public char gender;
    public double salary;
    public String jobTitle;
    public abstract void work();
    public abstract String toString();






}
