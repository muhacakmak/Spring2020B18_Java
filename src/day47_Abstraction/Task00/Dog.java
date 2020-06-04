package day47_Abstraction.Task00;

public class Dog extends Pets {
    public Dog(String name, int age, String color, String breed, char gender) {
        this.name=name;
        this.age=age;
        this.color=color;
        this.breed=breed;
        this.gender=gender;

    }
    @Override
    public void sleep() {
        System.out.println(name + "  is sleeping");

    }
    @Override
    public void eat() {

    }

    @Override
    public void speak() {

    }

    @Override
    public String toString() {
        return "Name: "+name+", age: "+age+", color: "+color+", breed: "+breed+", char: "+gender;
    }
}
