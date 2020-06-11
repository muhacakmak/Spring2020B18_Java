package day49_Polymorphisim;




class Animal extends Robot{


}

class Dog extends Animal {


}

class Cat extends Animal {

}
class Robot{

}

public class Polymorphism_Intro {
    public static void main(String[] args) {
        Animal obj2 = new Dog();

        Animal obj3 = new Cat();

        //Dog objt4=new Cat();
        Dog obj5 = new Dog();
        Cat obj6 = new Cat();
        Robot obj7=new Robot();

        Robot [] animalShow={obj2,obj3,obj5,obj6,obj7};



    }
}
