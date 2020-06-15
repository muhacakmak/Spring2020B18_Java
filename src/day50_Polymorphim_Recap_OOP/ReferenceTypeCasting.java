package day50_Polymorphim_Recap_OOP;

import day50_Polymorphim_Recap_OOP.Task01.Animal;
import day50_Polymorphim_Recap_OOP.Task01.Cat;
import day50_Polymorphim_Recap_OOP.Task01.Dog;

public class ReferenceTypeCasting {
    public static void main(String[] args) {
        int a = 100;
        double b = a;// implicitly done
        Dog dog = new Dog("a", 1, "F");
        Animal animal1 = dog;// upcasting, done implicitly


        Cat cat = new Cat("r", "F", 4);
        // Dog dog2=(Dog) cat;
        Animal animal2 = (Animal) cat;


        System.out.println("====================================");
        double c = 10;
        int d = (int) c;// explicit casting done

        Animal animal3 = new Dog("A", 12, "F");
        Dog dog3 = (Dog) animal3;//down casting , Must be done manually
        Animal animal4 = new Cat("C", "F", 7);
        Cat cat2=(Cat) animal4;

        System.out.println("=========================================");

        Animal animal5=new Dog("Lucy",5,"F");
        //animal5.bark();
       Dog dog2= (Dog)animal5;
       dog2.bark();

       // second way
        ((Dog)animal5).bark();



    }
}
