package day03_VariablesContinue;

public class kgToPounds {
   /*
    Task01:
   create a class called KgToPounds, and write a program
   that can convert Kg to pound and print the result
            Ex:
    kg = 10;
    output:
            10 kg is equal to 22.0462 pounds
            kg = 20
    output:
            20 kg is equal to 44.0925 pound
    */
    public static void main(String[] args) {
        int kg=10;
        double kgToPounds= kg*2.20462;
        System.out.println(kg +" kg is equal to "+kgToPounds+" pounds.");
    }
}
