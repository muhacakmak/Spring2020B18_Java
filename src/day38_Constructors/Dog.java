package day38_Constructors;

public class Dog {
    String name;
    String breed;
    int age;


    public Dog() {
        name = "unknown";
        breed = "unknown";
        age = 0;
    }

    public Dog(String breed) {
        name = "unknown";
        this.breed = breed;
        age = 0;

    }

    public Dog(String breed, int age) {
        name = "Unknown";
        this.breed = breed;
        this.age = age;

    }


    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age + '}';
    }
}
