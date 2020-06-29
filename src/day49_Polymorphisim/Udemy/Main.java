package day49_Polymorphisim.Udemy;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak() {
        return "Animal is speaking";
    }
}

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return this.getName() + " is miyavling";
    }

}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return this.getName() + " is barking";
    }
}

class horse extends Animal {

    public horse(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return this.getName() + " is kisning";
    }
}

public class Main {

    public static void main(String[] args) {
        Animal animal1 = new Cat("Limon");
        System.out.println(animal1.speak());

        Animal animal2 = new Dog("Karabas");
        System.out.println(animal2.speak());

        Animal animal3 = new horse("sahbatur");
        System.out.println(animal3.speak());


    }
}
