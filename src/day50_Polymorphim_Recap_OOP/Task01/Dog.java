package day50_Polymorphim_Recap_OOP.Task01;
/*
3. create subclass of Animal named Dog
            variable: dogName
            methods: bark
 */
public final class Dog extends Animal{
    String dogName;

    public Dog(String dogName, int age,String gender){
        this.dogName=dogName;
        this.gender=gender;
        this.age=age;

    }

    @Override
    public void eat(){
        System.out.println("Dog "+dogName+" is eating");
    }
    @Override
    public void sleep(){
        System.out.println("Dog "+dogName+" is sleeping");
    }
    public void bark(){
        System.out.println("Dog "+dogName+" is barking");
    }
    public static void methodA(int a){
        System.out.println("Dog class A");
    }
}
