package day50_Polymorphim.Task01;
/*
1. cerate a class Animal
            variables: age, gender
            methods: eat, sleep
 */
public abstract class Animal {
    public int age;
    public String gender;

    public void eat(){
        System.out.println("Animal is eating");
    }
    public void sleep(){
        System.out.println("Animal is sleep");
    }
    public static void methodA(){
        System.out.println("Animal class");
    }
}
