package day17_WhileLoops;

public class Frequency {
    public static void main(String[] args) {

        String str="Cybertek Scool is a great place to study".toLowerCase();

        String word="s".toLowerCase();

        int count=0;

        while (str.contains(word)){

            count++;
            str=str.replaceFirst(word,"");

        }
        System.out.println(count);


    }
}
