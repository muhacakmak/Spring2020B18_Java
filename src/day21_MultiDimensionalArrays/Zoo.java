package day21_MultiDimensionalArrays;

public class Zoo {
    public static void main(String[] args) {

        String[] wildAnimals = {"Tiger", "Lion", "Monkey", "Turtle", "Corcodile"};
        String[] bird = {"Eagle", "Ducks", "Peacock", "Chicken"};
        String[][] zoo = {wildAnimals, bird};
        //                0          1

        String kfc=zoo[1][3];
        System.out.println(kfc);
        System.out.println("===================");

        for (String eachBirds :zoo[1]) {
            if(eachBirds.equalsIgnoreCase("Chicken")){
                continue;
            }

            System.out.println(eachBirds);
        }
        System.out.println("================================");
        for (String eachWildAnimal:zoo[0]){
            if(eachWildAnimal.equalsIgnoreCase("Turtle")){
                continue;
            }
            System.out.println(eachWildAnimal);
        }
    }
}
