package day50_Polymorphim.Task01;

public class AnimalObjects {
    public static void main(String[] args) {

        Dog obj1 = new Dog("Lucy", 5, "Female");
        System.out.println(obj1.dogName);
        obj1.bark();


        Animal obj2 = new Dog("kito", 6, "Female");
        //System.out.println(obj2.dogName);
        //obj2.bark();
        obj2.eat();


        Animal animal1=new Cat("A","F",1);
        boolean isCat=animal1 instanceof Cat;
        System.out.println(isCat);

        Dog d1=new Dog("A",1,"F");
    //    boolean r1=d1 instanceof Cat;// there is no IS A relation

        Animal animal2=new Cat("Q","F",2);
        boolean r2=animal2 instanceof Animal;
        System.out.println(r2);



    }
}
