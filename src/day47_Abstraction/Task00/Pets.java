package day47_Abstraction.Task00;

/*
1. creaet an abstract class called Pets
				attributes: name, age, color, breed, gender
				methods:
					abstract methods: sleep, eat, speak
					instance method: toString
 */
public abstract class Pets {

    public String name;
    public int age;
    public String color;
    public String breed;
    public char gender;

    public abstract void sleep();

    public abstract void eat();

    public abstract void speak();

    public abstract String toString();

}
