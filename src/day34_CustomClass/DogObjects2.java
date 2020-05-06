package day34_CustomClass;

public class DogObjects2 {
    public static void main(String[] args) {
        String food1="Chicken";
        String food2="Fish";

        String drink1="Milk";
        String drink2="Coffee";

        String toy1="Ps4";
        String toy2="Piano";


        Dog dog1 = new Dog();
        dog1.setDogInfo("Alabay", "Extra Big", 5, "Brown", "Ajdar");


        Dog dog2 = new Dog();
        dog2.setDogInfo("Poodle", "Miniature", 2, "White", "Lucy");
        dog2.eating(food1);
        dog1.eating(food2);

        dog2.drinking(drink2);
        dog1.drinking(drink1);

        dog2.playing(toy2);
        dog1.playing(toy1);

        Dog dog3=new Dog();
        dog3.setDogInfo("Pomeranian","Small",4,"White","Ernie");

        Dog dog4=new Dog();
        dog4.setDogInfo("Pomeranian","Small",3,"White","Lil");

        System.out.println("================================================================");
        Dog[]dogPark={dog1,dog2,dog3,dog4};

        for (int i = 0; i <dogPark.length ; i++) {
            dogPark[i].eating(food1);
        }
        System.out.println("================================================================");
        for (Dog each:dogPark) {
          each.drinking("Water");
        }
        System.out.println("================================================================");

        for (int i = 0; i <dogPark.length ; i++) {
            dogPark[i].playing("football");
        }
        System.out.println("================================================================");
        for (Dog each:dogPark) {
            each.studying("Java");
        }
    }
}
